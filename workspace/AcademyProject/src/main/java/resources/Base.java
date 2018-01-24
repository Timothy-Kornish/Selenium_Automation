package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream("/Users/TimmehK/Selenium_Automation/workspace/AcademyProject/src/main/java/resources/academy.properties");
		
		prop.load(file);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		if (browserName.equals("chrome")) {
			// code to execute in chrome browser
			System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
			driver = new ChromeDriver();
			
		} else if (browserName.equals("firefox")) {
			// code to execute in firefox browser
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			// execute code in Internet Explorer
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String name) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("/Users/Timmehk/Selenium_Automation/workspace/AcademyProject/screenshots/screenshot_" + name + ".png"));
	}
}
