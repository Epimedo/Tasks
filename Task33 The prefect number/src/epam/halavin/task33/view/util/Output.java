package epam.halavin.task33.view.util;

import org.apache.log4j.Logger;

public class Output {
	static private final Logger LOG = Logger.getRootLogger();

	public static void consoleOutput(String str) {
		System.out.println(str);
	}

	static public void logOutput(String str) {
		LOG.info(str);
	}
}
