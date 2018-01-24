package Academy;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.Base;

public class validateTitle extends Base{

	public static Logger log =  LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initializes");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage url");
	}
	
	@Test()
	public void basePageNavigation() throws IOException {
		
		LandingPage land = new LandingPage(driver);
		AssertJUnit.assertEquals(land.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated test");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		driver = null;
	}

}
