package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	private WebDriver driver;
	private By search = By.id("srchword");
	private By submit = By.xpath("//*[@id=\"queryTop\"]/div/input[6]");
	
	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement search() {
		return driver.findElement(search);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	
}
