package trivera.storage;

import java.util.Arrays;

public class StringArray {

	private int count;

	private String[] data = new String[5];

	public int size() {
		return count;
	}


	public String get(int index) {
		return data[index];
	}


	public void add(String string) {

		if (string == null) {
			return;
		}

		data[count++] = string;

		// When array is full, let's create bigger array
		if (count == data.length) {
			// Create array, 5 bigger than the original array
			String[] newData = new String[data.length + 5];
			// Copy the data from the old array into the new Array
			System.arraycopy(data, 0, newData, 0, data.length);
			// Move the reference to the new array to the instance variable
			this.data = newData;
		}
	}

	public void remove(String string) {
		// When param is null do nothing
		if (string == null)
			return;

		// Create a new Array with the same size as the original array
		String[] newData = new String[data.length];
		int count = 0;
		// Iterate over all Objects in the instance array
		for (String currentObject : data) {
			// Since the array only holds null pointers at the end
			// We can stop once reference is null
			if (currentObject == null) {
				break;
			}
			// When the String in the original array is NOT equal
			// To the value to remove, copy to the new array
			if (!(string.equals(currentObject))) {
				newData[count++] = currentObject;
			}
		}
		// Move the reference to the new array to the instance variable
		this.data = newData;
		// Set the instance counter to the amount of elements copied
		this.count = count;
	}

	/**
	 * Remove all Strings from the dynamic array.
	 */
	public void clear() {
		Arrays.fill(data, null);
		this.count = 0;
	}

}
