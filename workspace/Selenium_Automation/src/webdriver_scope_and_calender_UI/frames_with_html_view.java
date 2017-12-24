package webdriver_scope_and_calender_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_with_html_view {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fantasycricket.dream11.com/IN/");
		
		switchToFrame(driver);
		
		//Thread.sleep(5000);
		//driver.quit();

	}
	
	public static void switchToFrame(WebDriver driver){ 
		System.out.println("Size: " + driver.findElements(By.tagName("iframe")).size());
		
		for (int i = 0; i < driver.findElements(By.tagName("iframe")).size(); i++) {
			System.out.println(i);
			driver.switchTo().frame(i);
			if (driver.findElements(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).size() > 0) {
				System.out.println("Found link");
				driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div(5)")).click();
				break;
			} else {
				System.out.println("Continue Looping...");
			}
			
		}
		driver.switchTo().defaultContent();
		
	}

}
