package Basics_Browser_drivers;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.WebDriver;


public class safari {

	public static void main(String[] args) {
		// Safari has weird session issues due to update after Safari version 10
		SafariOptions options = new SafariOptions();
		options.setUseCleanSession(true);
		WebDriver safariDriver = new SafariDriver(options);
		safariDriver.get("http://www.google.com");
		
	}

}
