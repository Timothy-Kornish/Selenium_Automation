package Basics_Browser_drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();
		
		//------------------------------------------------------------------------------
		// validating xpath and css elements
		//------------------------------------------------------------------------------
		
		//can enter in console for xpath: $x("//*[@id=\"forgot_password_link\"]") 
		//can enter in console for css: $("#mydomainLink")
		// in console: xpath: $x(""), css: $("")
		// xpath for forgot your password: //*[@id="forgot_password_link"]
		// css selector for custom domain:  #mydomainLink
		
		driver.quit();
	}

}
