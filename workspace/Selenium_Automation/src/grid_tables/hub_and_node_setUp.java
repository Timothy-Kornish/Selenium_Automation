package grid_tables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;


public class hub_and_node_setUp {

	public static void main(String[] args) {
		/* 
		Set up Selenium grid on localhost port 4444
		 
		In Command prompt:
		java -jar selenium-server-standalone-3.8.1.jar -role hub
		
		got to:     http://localhost:4444/grid/console
		
		For Custom port 8888:
		java -jar selenium-server-standalone-3.8.1.jar -role hub -port 8888
		
		
		Set up webdriver on hub
		
		java -jar selenium-server-standalone-3.8.1.jar -role webdriver -hub http://192.168.1.2:8888/grid/register
		
		*/
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		// instructor didn't give an explanation on file path used in next line, my attempts don't work
		//capabilities.setCapability(ChromeDriver.BINARY,  new File("/Users/Timmehk/Automation/chromedriver").getAbsolutePath());
		
		//WebDriver driver = new RemoteWebDriver(new URL("http:/192.168.1.2:5555/wd/hub"), capabilities);
		
		
		
		
		
		
		

	}

}
