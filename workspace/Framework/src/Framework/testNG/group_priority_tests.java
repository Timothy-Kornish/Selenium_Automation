package Framework.testNG;

import org.testng.annotations.Test;

public class group_priority_tests {

	@Test(groups = ("Priority2"))
	public void flightBooked() {
		System.out.println("Executing Test 2");
	}
	
	@Test(groups = ("Priority1"))
	public void flightBooking() {
		System.out.println("Executing Test 1");
	}

	

}
