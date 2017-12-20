package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		//----------------------------------------------------------------------------------------
		//  Implicit Wait
		//  wait for n number of seconds before throw exception
		// waits for all element on page to load before looking for specific element
		//----------------------------------------------------------------------------------------

		driver.findElement(By.xpath("//*[@id=\"H-destination\"]")).sendKeys("NYC");
		driver.findElement(By.xpath("//*[@id=\"H-destination\"]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"H-fromDate\"]")).sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"1252723\"]/div[2]/div/a")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
