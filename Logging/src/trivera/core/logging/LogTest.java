package trivera.core.logging;



import java.io.IOException;
import java.util.logging.*;

public class LogTest {
	private static Logger logger = Logger.getLogger("trivera.core.logging.LogTest");
	
	public static void main(String args[]) throws IOException {
		LogTest lt = new LogTest();

		System.out.println("Ready...");
		
//		FileHandler fh = new FileHandler("test.txt");
//		fh.setLevel(Level.CONFIG);
//		fh.setFormatter(new SimpleFormatter());
//		logger.addHandler(fh);
		
		
		lt.finestTest();
		lt.finerTest();
		lt.fineTest();
		lt.configTest();
		lt.infoTest();
		lt.warningTest();
		lt.severeTest();
		
		return;
	}
	
	private void finestTest() {
		logger.finest("Finest Event");
	}
	
	private void finerTest() {
		logger.finer("Finer Event");
	}
	
	private void fineTest() {
		logger.fine("Fine Event");
	}
	
	private void configTest() {
		logger.config("Config Event");
	}
	
	private void infoTest() {
		logger.info("Info Event");
	}
	
	private void warningTest() {
		logger.warning("Warning Event");
	}
	
	private void severeTest() {
		logger.severe("Severe Event");
	}
}
