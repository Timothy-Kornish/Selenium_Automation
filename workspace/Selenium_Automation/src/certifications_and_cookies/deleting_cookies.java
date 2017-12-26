package certifications_and_cookies;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.os.WindowsUtils;



public class deleting_cookies {

	public static void main(String[] args) {
		//------------------------------------------------------------------------------------
		// Desired Capabilities
		//------------------------------------------------------------------------------------
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		//cap.acceptInsecureCerts(); // or can be done another way
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				
				
		ChromeOptions option = new ChromeOptions();
		option.merge(cap);
				
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver(option);

		//------------------------------------------------------------------------------------
		// Maximizing the browser
		//------------------------------------------------------------------------------------
						
		driver.manage().window().maximize();
				
		//------------------------------------------------------------------------------------
		// Deleting Cookies
		//------------------------------------------------------------------------------------
					
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("mmmm cookies");
		WindowsUtils.killByName("excel.exe");
		
		driver.get("https://www.google.com/");
			
	}

}
