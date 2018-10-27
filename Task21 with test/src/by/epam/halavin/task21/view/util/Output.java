package by.epam.halavin.task21.view.util;

import org.apache.log4j.Logger;

public class Output {
	static private final Logger LOG = Logger.getRootLogger();

	static public void consoleOutput(String str) {
		System.out.println(str);
	}

	static public void logOutput(String str) {
		LOG.info(str);
	}
}
