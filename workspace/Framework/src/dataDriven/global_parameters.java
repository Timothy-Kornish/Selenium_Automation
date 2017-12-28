package dataDriven;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;




public class global_parameters {

	@Test
	public void Login() throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream fileIStream = new FileInputStream("/Users/TimmehK/Selenium_Automation/workspace/Framework/src/dataDriven/dataDriven.properties");
		prop.load(fileIStream);
		WebDriver driver = null;
		
		System.out.println("Username on property file is: " + prop.getProperty("username"));
		
		if (prop.getProperty("browser").contains("chrome")) {
			
			System.out.println("using Chrome Browser");
			System.setProperty(prop.getProperty("driver"), prop.getProperty("location"));
			driver = new ChromeDriver();
			
		} else if (prop.getProperty("browser").contains("firefox")) {
			
			System.out.println("using Firefox Browser");
			System.setProperty(prop.getProperty("driver"), prop.getProperty("location"));
			driver = new FirefoxDriver();
			
		} else {
			
			System.out.println("Running on some other browser that shouldn't be used");
		
		}
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(4000);
		driver.quit();
		
	}
	
}
