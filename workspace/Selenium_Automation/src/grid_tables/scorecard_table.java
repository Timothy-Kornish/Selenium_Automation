package grid_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scorecard_table {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cricbuzz.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//----------------------------------------------------------------------------------------------
		// These waitToClick paths will change in the future,
		// i used them to navigate through multiple pages for practice
		//----------------------------------------------------------------------------------------------

		waitToClick(driver, wait, By.xpath("//*[@id=\"cb-main-menu\"]/a[2]"));
		waitToClick(driver, wait, By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/a[2]"));
		waitToClick(driver, wait, By.xpath("//*[@id=\"matchCenter\"]/div[2]/nav/a[2]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"innings_1\"]/div[1]")));
		Thread.sleep(1000);
		WebElement table = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")));
		
		int rowCount = table.findElements(By.cssSelector("[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int totalSum = 0;
		
		System.out.println("R scores:\n----------------\n");
		
		for (int i = 0; i < rowCount - 2; i++) {
			int value = Integer.parseInt(table.findElements(By.cssSelector("[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			System.out.println(value);
			totalSum += value;
		}
		
		System.out.println("\n----------------\n");
		
		int extras = Integer.parseInt(driver.findElement(By.xpath("//div[text()=\"Extras\"]/following-sibling::div")).getText());
		int actualTotal = Integer.parseInt(driver.findElement(By.xpath("//div[text()=\"Total\"]/following-sibling::div")).getText());
		
		System.out.println("Extras: " + extras);
		System.out.println("total sum: " + totalSum);
		System.out.println("total sum + extras = " + (totalSum + extras));
		System.out.println("Actual total: " + actualTotal);
		
		if (actualTotal == totalSum+extras) {
			System.out.println("Test was a success!");
		} else {
			System.out.println("Test failed");
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void waitToClick(WebDriver driver, WebDriverWait wait, By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
	}

}
