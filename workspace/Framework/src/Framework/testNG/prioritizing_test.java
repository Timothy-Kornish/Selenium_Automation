package Framework.testNG;

import org.testng.annotations.Test;


public class prioritizing_test {

	@Test(dependsOnMethods = ("SecondTest"), alwaysRun = true) // requires SecondTest to execute before this test can.
	public void FirstTest() {
		System.out.println("Executing First Test");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Executing Second Test");
	}

	@Test(enabled = false)
	public void ThirdTest() {
		System.out.println("Third test, should not execute");
	}
	
	@Test(timeOut = 5000)
	public void FourthTest() {
		System.out.println("Executing Fourth Test");
	}
}
