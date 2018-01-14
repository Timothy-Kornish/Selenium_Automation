package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	private WebDriver driver;
	private By username = By.xpath("//*[@id='login1']");
	private By password = By.name("passwd");
	private By go = By.name("proceed");
	private By home = By.linkText("rediff.com");
	
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement EmailId() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement submit() {
		return driver.findElement(go);
	}
	public WebElement home() {
		return driver.findElement(home);
	}
	
}
