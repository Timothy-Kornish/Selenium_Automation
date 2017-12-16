package locatorIdentifiers;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Username");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		//driver.quit();
		
		// CSS selector path for email:  #email
		// <input type="email" class="inputtext" name="email" id="email" tabindex="1" data-testid="royal_email">
		
		//------------------------------------------------------------------------------------------------------
		// creating custom xpath formula
		//------------------------------------------------------------------------------------------------------

		// xpath: //tagname[@attibute="value"]
		
		Map<String, String> tags = new HashMap<>();
		tags.put("Tagname", "input");
		tags.put("Attributes", "type, class, name, id, tabindex, data-testid");
		tags.put("values", "email, inputtext, email, email, 1, royal_email");
		
		
	}

}
