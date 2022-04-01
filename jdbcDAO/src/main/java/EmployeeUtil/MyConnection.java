package EmployeeUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	public static Connection connect() {
		Connection conn =null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String url ="jdbc:mysql://localhost:3306/db1";
			
			try {
				conn = DriverManager.getConnection(url, "root","Raj@4317.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return conn;
		
	}

}
