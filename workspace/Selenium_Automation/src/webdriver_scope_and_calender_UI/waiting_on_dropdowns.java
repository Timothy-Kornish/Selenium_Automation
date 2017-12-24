package webdriver_scope_and_calender_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waiting_on_dropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");

		WebDriver driver=new ChromeDriver();
		WebDriverWait wd=new WebDriverWait(driver,7);

		driver.get("https://fantasycricket.dream11.com/IN/");

		driver.manage().window().maximize();

		int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));
		int j=gotoframe(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
		
		driver.switchTo().frame(m);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

		if(j!=-1) {
			driver.switchTo().frame(j);
			//WebDriverWait wd=new WebDriverWait(driver,5);
			//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));
			driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
		} else {
			System.out.println("ops");
		}

	}
	
	public static int gotoframe(WebDriver driver1,By by) {
		driver1.switchTo().defaultContent();
		int i;
		int num = -1;
		int a=driver1.findElements(By.tagName("iframe")).size();

		for(i = 0; i < a; i++) {

				driver1.switchTo().defaultContent();
				driver1.switchTo().frame(i);
				int b=driver1.findElements(by).size();

				if(b>0) {
					num=i;
					break;
				}
		}

	driver1.switchTo().defaultContent();
	return num;

	}
}
