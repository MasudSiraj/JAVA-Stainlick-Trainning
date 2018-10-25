package trivera.annotations.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WriterService {

	public void writeObject(Serializable obj) {

		Class<? extends Serializable> clazz = obj.getClass();

		if (!clazz.isAnnotationPresent(Persist.class)) {
			throw new RuntimeException(clazz.getName() + " does not contain the Persist annotation");
		}

		Persist persistAnnotation = clazz.getAnnotation(Persist.class);
		String filename = persistAnnotation.filename();
		Object identifier = null;

		for (Method method : clazz.getMethods()) {

			if (method.isAnnotationPresent(Identifier.class)) {

				try {
					identifier = method.invoke(obj);
				} catch (IllegalAccessException | InvocationTargetException e) {
					System.out.println("Error while trying to invoke identifier method: " + method.getName());
				}
			}

		}

		writeObject(obj, filename, identifier);
	}

	/**
	 * Write object instance to file	
	 * @param obj the object to Serialize
	 * @param filename The filename (without extension!)
	 */
	private void writeObject(Serializable obj, String filename) {
		writeObject(obj, filename,null);
	}

	/**
	 * Write object instance to file	
	 * @param obj the object to Serialize
	 * @param filename The filename (without extension!)
	 * @param identifier the identifier value of this instance
	 */
	private void writeObject(Serializable obj, String filename, Object identifier) {

		StringBuilder sb = new StringBuilder(filename);
		if (identifier != null) {
			sb.append("-").append(identifier.toString());
		}
		sb.append(".ser");
		File outputFile = new File(sb.toString());
		try (FileOutputStream fos = new FileOutputStream(outputFile);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(obj);

			System.out.println("Created " + outputFile.getAbsolutePath());

		} catch (IOException ioe) {
			System.out.println(String.format("Error writing %s : %s", outputFile, ioe.getMessage()));
			ioe.printStackTrace();
		}
	}
}
