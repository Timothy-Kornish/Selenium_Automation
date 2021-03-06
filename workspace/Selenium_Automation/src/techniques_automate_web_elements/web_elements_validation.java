package techniques_automate_web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_elements_validation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.makemytrip.com/");
		
		//----------------------------------------------------------------------------------------
		// Validating html element being displayed
		// for isDisplayed(): element must be present in code but have property: hidden = true
		//----------------------------------------------------------------------------------------
				
		System.out.println("Before clicking on multi city radio button");
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"multicity\"]/label")).click();
		System.out.println("After clicking on multi city radio button");
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());

		//----------------------------------------------------------------------------------------
		// Validate what text is in an html element
		//----------------------------------------------------------------------------------------
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"fd-wrap\"]/div[2]/h2")).getText());
		
		//----------------------------------------------------------------------------------------
		// If you want to validate the object which is present in web page or code base 
		//----------------------------------------------------------------------------------------
				
		int count = driver.findElements(By.xpath("//*[@id=\"mulicity\"]/label")).size(); //incorrect xpath
		if (count == 0) {
			System.out.println("Verified");
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
