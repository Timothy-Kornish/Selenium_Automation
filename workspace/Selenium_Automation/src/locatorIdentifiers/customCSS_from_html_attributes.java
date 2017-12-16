package locatorIdentifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customCSS_from_html_attributes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//------------------------------------------------------------------------------------------------------
		// creating custom xpath formula
		//------------------------------------------------------------------------------------------------------

		// xpath: //tagname[@attibute="value"]
		// for all tags: *[@attribute="value"]
		
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		
		//------------------------------------------------------------------------------------------------------
		// creating custom css selector formula
		//------------------------------------------------------------------------------------------------------

		// css selector: tagname[attibute="value"]
		// for all tags: [attribute="value"]
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("My own css path");
		driver.findElement(By.cssSelector("[value=\"Log In\"]")).click();
		
	}

}
