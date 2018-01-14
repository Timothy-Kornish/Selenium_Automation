package beta;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Demo_Beta {

	private static Logger log = LogManager.getLogger(Demo_Beta.class.getName());
	public static void main(String[] args) {
		
		log.debug("I am debugging");
		if (true) {
			log.info("Object is present");
			log.error("object is present");
			log.fatal("This is fatal");
		} 
		
	}
}
