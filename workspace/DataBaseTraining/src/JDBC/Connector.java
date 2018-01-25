package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/Selenium?useSSL=false";
		String user = "root";
		String password = "root";
		
		
		System.out.println("Connecting to Database...");
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Successful");

		Statement state = conn.createStatement();
		ResultSet result = state.executeQuery("SELECT * FROM EmployeeInfo WHERE name = 'TIM';");
		
		while(result.next()){
			System.out.println(result.getString("dept"));
			System.out.println(result.getString("age"));
		}
	}
}
