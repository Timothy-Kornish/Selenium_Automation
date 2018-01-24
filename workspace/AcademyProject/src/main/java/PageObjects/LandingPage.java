package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

	private WebDriver driver;
	By signIn = By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	By title = By.cssSelector(".text-center > h2");
	By navBar = By.cssSelector(".navbar-nav");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return this.driver.findElement(signIn);
	}
	
	public WebElement getTitle() {
		return this.driver.findElement(title);
	}
	
	public WebElement getNavBar() {
		return this.driver.findElement(navBar);
	}

}
