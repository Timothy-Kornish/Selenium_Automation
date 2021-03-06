package techniques_automate_web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class handling_dropdowns_checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");

		//----------------------------------------------------------------------------------------
		// Static Dropdowns 
		//----------------------------------------------------------------------------------------
		
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByValue("2");
		adult.selectByIndex(6);
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByVisibleText("2");
		
		//----------------------------------------------------------------------------------------
		// Dynamic Dropdowns
		//  the path on line 33 works in chropath, but will not work here for some reason, ElementNotVisibleException
		//----------------------------------------------------------------------------------------
		
		Select departure = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		departure.getAllSelectedOptions();
		//driver.findElement(By.xpath("//form/div/div/div/div/div/div/div/div/div/div/div/div/select[@id=\"ctl00_mainContent_ddl_originStation1\"]")).click();
		//departure.selectByValue("GOI");
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1")).click();

		//----------------------------------------------------------------------------------------
		// Checkboxes 
		//----------------------------------------------------------------------------------------
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());

	}

}
