package locatorIdentifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.quit();
		
		
		// Chrome and Firefox will give the Xpath
		// xpath for salesforce login button (includes slashes): //*[@id="Login"]
		// xpath for salesforce username (includes slashes): //*[@id="username"]
		// xpath for salesforce password (includes slashes): //*[@id="password"]
	}

}
