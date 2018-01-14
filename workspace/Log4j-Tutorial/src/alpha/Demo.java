package alpha;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		
		log.debug("I am debugging");
		if (true) {
			log.info("Object is present");
			log.error("object is present");
			log.fatal("This is fatal");
		} 
		
	}
}
