package locatorIdentifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolute_relative_xpaths {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.qaclickacademy.com/interview.php");
		
		//----------------------------------------------------------------------------------------
		// Absolute xpath
		//----------------------------------------------------------------------------------------
		
		//2nd button
		driver.findElement(By.xpath("//Section/div/div/div/div/ul/li[@id=\"tablist1-tab2\"]")).click();
		
		//----------------------------------------------------------------------------------------
		// Relative xpath
		//----------------------------------------------------------------------------------------
		
		//3rd button -traversing siblings
		driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/following-sibling::li[2]")).click();
		//4th button
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab4\"]")).click();
		
		//----------------------------------------------------------------------------------------
		// traversing back to parent element from child element with xpath
		//----------------------------------------------------------------------------------------
		
		driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/parent::ul")).click();

		//----------------------------------------------------------------------------------------
		// Identify elements with text based
		//----------------------------------------------------------------------------------------
		
		driver.findElement(By.xpath("//*[text() = ' Selenium ']")).click();
		driver.findElement(By.xpath("//*[text() = ' Soap UI ']")).click();
	}

}
