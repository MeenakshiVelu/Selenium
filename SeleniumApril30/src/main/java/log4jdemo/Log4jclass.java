package log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jclass {
	
	static Logger logger = LogManager.getLogger(Log4jclass.class);
	

	public static void main(String[] args) {
		
		System.out.println("Hello this is a test");
		
		logger.trace("Trace message");
		logger.info("This is info message");
		logger.error("This is a error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a FATAL message");
		
		System.out.println("This is completed");
		
		

	}

}
