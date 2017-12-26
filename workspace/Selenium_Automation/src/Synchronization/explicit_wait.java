package Synchronization;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		//----------------------------------------------------------------------------------------
		//  Explicit Wait
		//----------------------------------------------------------------------------------------

		driver.findElement(By.xpath("//*[@id=\"H-destination\"]")).sendKeys("NYC");
		driver.findElement(By.xpath("//*[@id=\"H-destination\"]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"H-fromDate\"]")).sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"1252723\"]/div[2]/div/a")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"1252723\"]/div[2]/div/a")));

		driver.findElement(By.xpath("//*[@id=\"1252723\"]/div[2]/div/a")).click();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
