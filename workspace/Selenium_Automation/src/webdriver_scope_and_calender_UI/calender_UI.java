package webdriver_scope_and_calender_UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender_UI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");

		//-------------------------------------------------------------------------------------
		// Picking out a date
		// grab a common attribute, put it into a list then iterate through the list
		//-------------------------------------------------------------------------------------
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		
		for (int i = 0; i < days.size(); i++) {
			String date_text = driver.findElements(By.className("day")).get(i).getText();
			if (date_text.equals("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
