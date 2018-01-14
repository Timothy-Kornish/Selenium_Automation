package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id='login1']" )
	WebElement username;
	
	@FindBy(name = "passwd")
	WebElement password;
	
	@FindBy(name= "proceed")
	WebElement go;
	
	@FindBy(linkText = "reddif.com")
	WebElement home;
	
	public RediffLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement EmailId() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement submit() {
		return go;
	}
	public WebElement home() {
		return home;
	}
	
}
