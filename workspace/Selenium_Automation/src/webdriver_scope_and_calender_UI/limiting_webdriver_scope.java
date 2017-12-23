package webdriver_scope_and_calender_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class limiting_webdriver_scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Timmehk/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com//");
	
		//-------------------------------------------------------------------------------------
		// Count all links on main page, use tagname "a"
		//-------------------------------------------------------------------------------------
		
		System.out.println("Number of links on main page: " + driver.findElements(By.tagName("a")).size());
		
		//-------------------------------------------------------------------------------------
		// Count all links on footer section of page, use tagname "a"
		// only links in scope of footer
		//-------------------------------------------------------------------------------------
		
		WebElement footer = driver.findElement(By.xpath("//*[@id=\"glbfooter\"]"));
		int footerCount = footer.findElements(By.tagName("a")).size();
		System.out.println("Number of links in footer section: " + footerCount);
		
		//-------------------------------------------------------------------------------------
		// Count all links on in second column of footer section of page, use tagname "a"
		//-------------------------------------------------------------------------------------
				
		WebElement column2 = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
		System.out.println("Number of links in column 2 of footer section: " + column2.findElements(By.tagName("a")).size());
		
		//-------------------------------------------------------------------------------------
		// Printing all the names of each link
		// click the link with text: Site map
		//-------------------------------------------------------------------------------------
		String beforeClick = null, afterClick = null;	
		
		System.out.println("All the Links in Column 2 Names:\n--------------------\n");
		for (int i = 0; i < column2.findElements(By.tagName("a")).size(); i++) {
			System.out.println(column2.findElements(By.tagName("a")).get(i).getText());
			
			if (column2.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				beforeClick = driver.getTitle();
				column2.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		
		System.out.println("\n---------------------\nTitle of page: " +driver.getTitle());
		afterClick = driver.getTitle();
		
		//-------------------------------------------------------------------------------------
		// Clicking the last link in the column
		//-------------------------------------------------------------------------------------
				
		//column2.findElements(By.tagName("a")).get(column2.findElements(By.tagName("a")).size() - 1).click();
		
		//-------------------------------------------------------------------------------------
		// Assertions
		//-------------------------------------------------------------------------------------
			
		if (!beforeClick.equals(afterClick)) {
			boolean displayed = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).isDisplayed();
			if (displayed) {
				System.out.println("Pass");
			}
		} else {
			System.out.println("Fail");
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
