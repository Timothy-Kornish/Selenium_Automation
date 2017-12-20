package techniques_automate_web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		//----------------------------------------------------------------------------------------
		// Handling alert windows
		// Accept = ok, done = yes
		//----------------------------------------------------------------------------------------
		
		String text = driver.switchTo().alert().getText();
		System.out.println("Text form alert window: " + text);
		//driver.switchTo().alert().sendKeys("Hello alert pop up");
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

}
