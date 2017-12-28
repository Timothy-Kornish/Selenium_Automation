package dataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Optional;
import java.lang.Math;


public class parameterizing_data {
	
	@DataProvider
	public Object[][] getData() {
		// i stands for number of times testcase should run
		// j stands for number of parameters testcase should send for each go
		
		int i = 3, j = 3;	
		Object[][] data = new Object[i][j];
		/*for (int n = 0; n < i; n++) {
			for (int m = 0; m < j; m++) {
				data[n][m] = Math.floor(Math.random() * 10);
			}
		}*/
		data[0][0] = "username:abcd";
		data[0][1] = "password:xyz";
		data[0][2] = "id:Tim";
		
		data[1][0] = "username:efgh";
		data[1][1] = "password:123";
		data[1][2] = "id:Mit";
		
		data[2][0] = "username:ijkl";
		data[2][1] = "password:456";
		data[2][2] = "id:IMT";
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void UserID(String username, String password, String id) {
		System.out.println("Printing username: " + username);
		System.out.println("Printing password: " + password);
		System.out.println("Printing ID: " + id);
	}
	
	@Test
	@Parameters(("adminUserID"))
	public void FlightBooking(String UserID) {
		System.out.println("Displaying the admin User ID from xml file: " + UserID);
		System.out.println("Executing Test");
		
	}
}
