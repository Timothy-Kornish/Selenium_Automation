package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email  = By.id("user_email");
	By password = By.id("user_password");
	By loginButton = By.xpath("//*[@id=\"new_user\"]/div[3]/input");
	
	public WebElement getEmailBox() {
		return this.driver.findElement(email);
	}
	
	public WebElement getPasswordBox() {
		return this.driver.findElement(password);
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(loginButton);
	}
}
