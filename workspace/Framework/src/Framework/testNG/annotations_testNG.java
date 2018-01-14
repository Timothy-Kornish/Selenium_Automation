package Framework.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class annotations_testNG {

	// @Test is necessary to run as a TestNG program
	// Test are shown running alphabetically by defaut
	
	@BeforeSuite
	public void installSoftware() {
		System.out.println("I am the first thing printed");
	}
	
	@BeforeTest 
	public void openingBrowser() {
		System.out.println("Before testing method");
	}
	
	@Test
	public void assignedSeat() {
		System.out.println("Assigning Seat (this test will fail!)");
		Assert.assertTrue(false);
	}
	
	@Test
	public void flightBooking() {
		System.out.println("Flight Booking");
	}
	
	@AfterTest
	public void DeleteCookies() {
		System.out.println("Deleting Cookies after all tests have ran");
	}
	
	@BeforeMethod
	public void beforeEachMethod() {
		System.out.println("This method will happen before each test method");
	}
	
	@AfterMethod 
	public void reportAdding() {
		System.out.println("This code will run after each test method");
	}
	
	@AfterSuite
	public void deleteSoftware() {
		System.out.println("I am the last thing printed");
	}
	
}
