package techniques_automate_web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");

		//----------------------------------------------------------------------------------------
		// Radio Buttons 
		//----------------------------------------------------------------------------------------
		
		driver.findElement(By.xpath("//input[@value=\"Cheese\"]")).click();
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(count);
		
		//----------------------------------------------------------------------------------------
		// dynamically handle Radio Buttons 
		//----------------------------------------------------------------------------------------
		
		for(int i = 0; i < count; i++) {
			
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
		//----------------------------------------------------------------------------------------
		// dynamically handle Radio Buttons 
		//----------------------------------------------------------------------------------------
				
		
	}

}
