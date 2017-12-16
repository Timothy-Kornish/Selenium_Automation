package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Timmehk/Automation/geckodriver");
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("http://www.qaclickacademy.com");
		//firefoxDriver.close();
		firefoxDriver.quit();
	}

}
