package Basics_Browser_drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Browserinvocation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Timmehk/Automation/geckodriver");
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("http://www.qaclickacademy.com");
		//firefoxDriver.close();
		firefoxDriver.quit();
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://www.google.com");
	    System.out.println(chromeDriver.getTitle());
	    // System.out.println(chromeDriver.getPageSource()); // get's source code of page, its a lot
	    System.out.println(chromeDriver.getCurrentUrl());
	    chromeDriver.close();
	}
	
}
