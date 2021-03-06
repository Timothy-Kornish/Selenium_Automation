package mouse_actions_multiple_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hadnling_frames {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		//-------------------------------------------------------------------------------------
		// Switching to an iframe
		//-------------------------------------------------------------------------------------
				
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		driver.findElement(By.id("draggable")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
		
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act.dragAndDrop(source, target).build().perform();
		
		//-------------------------------------------------------------------------------------
		// Switching back to main page from iframe
		//-------------------------------------------------------------------------------------
				
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
