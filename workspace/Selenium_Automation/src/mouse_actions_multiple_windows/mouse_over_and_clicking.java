package mouse_actions_multiple_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over_and_clicking {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		//-------------------------------------------------------------------------------------
		// Move mouse over web element
		//-------------------------------------------------------------------------------------
		
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(elem).build().perform();
		
		//-------------------------------------------------------------------------------------
		// Send Capital letters with an action
		//-------------------------------------------------------------------------------------
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HELLO");
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
