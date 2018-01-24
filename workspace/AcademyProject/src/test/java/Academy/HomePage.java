package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{

	public static Logger log =  LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initializes");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password, String text) throws IOException {
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage url");
		LandingPage land = new LandingPage(driver);
		land.getLogin().click();
		LoginPage login = new LoginPage(driver);
		login.getEmailBox().sendKeys(Username);
		login.getPasswordBox().sendKeys(Password);
		System.out.println(text);
		login.getLoginButton().click();

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		driver = null;
	}
	
	@DataProvider
	public Object[][] getData() {
		// row stands for how many different data types test should run
		// column stands for how many values per each test
		int row = 2;
		int col = 3;
		Object[][] data = new Object[row][col];
		
		data[0][0] = "jamal@qw.com";
		data[0][1] = "jamals password";
		data[0][2] = "Restricted User";
		
		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "password";
		data[1][2] = "Non Restricted User";
		
		return data;
	}
}
