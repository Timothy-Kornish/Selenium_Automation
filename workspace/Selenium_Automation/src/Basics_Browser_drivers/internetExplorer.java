package Basics_Browser_drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetExplorer {
	public static void main(String[] args) {
		// Can only be run on a windows machine, this is a mac
		System.setProperty("webdriver.ie.driver", "/Users/Timmehk/Automation/IEDriverServer.exe");
		WebDriver IE_Driver = new InternetExplorerDriver();
		IE_Driver.get("http://www.qaclickacademy.com");
		//firefoxDriver.close();
		IE_Driver.quit();
	}
}
