package locatorIdentifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_Selectors_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		//----------------------------------------------------------------------------------------
		// CSS Selector - around 10x faster than xpath
		// don't need tagname with css 
		// input[id='username'] == [id='username']
		//----------------------------------------------------------------------------------------
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("Usename");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password");
		driver.findElement(By.cssSelector("input[id='Login']")).click();

	}

}
