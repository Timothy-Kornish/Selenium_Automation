package locatorIdentifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_child_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		// grandparent xpath of an input within a nested div:
		//      		"//div[@class=\"lst-c\"/div/div[2]/div/input"
	}

}
