package certifications_and_cookies;

//------------------------------------------------------------------------------------
// SSL (Secure Socket Layer) Certificate 
//------------------------------------------------------------------------------------

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class https_certification {

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
		
		
	}

}
