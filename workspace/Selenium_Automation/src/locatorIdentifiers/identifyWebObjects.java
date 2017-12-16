package locatorIdentifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class identifyWebObjects {

	public static void load_interact_Facebook(WebDriver driver) {
		driver.get("http://www.facebook.com"); // URL in browser
		driver.findElement(By.id("email")).sendKeys("This is my first email insertion code");
		//driver.findElement(By.id("pass")).sendKeys("This is my first password insertion");
		driver.findElement(By.name("pass")).sendKeys("my password is 123456");
		//driver.findElement(By.id("u_0_2")).click(); // login button
		driver.findElement(By.linkText("Forgot account?")).click();
		
	}
	public static void load_interact_SalesForce(WebDriver driver) {
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wider primary")).click();// error compound class names not allowed
		
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		load_interact_Facebook(driver);
		load_interact_SalesForce(driver);
		driver.quit();
	}

}
