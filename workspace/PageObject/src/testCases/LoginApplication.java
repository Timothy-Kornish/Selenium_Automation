package testCases;

import objectRepository.RediffLoginPage;
import objectRepository.RediffHomePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginApplication  {
	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("my username here");
		rd.password().sendKeys("my password here");
		rd.submit().click();
		
		Thread.sleep(2000);
		rd.home().click();
		Thread.sleep(2000);
		RediffHomePage rh = new RediffHomePage(driver);
		rh.search().sendKeys("Rediff");
		rh.submit().click();
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	

}
