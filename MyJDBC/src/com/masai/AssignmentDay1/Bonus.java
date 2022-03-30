package com.masai.AssignmentDay1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		
		try(Connection conn = DriverManager.getConnection(url, "root","Raj@4317.")){
			 
			PreparedStatement ps = conn.prepareStatement("update employee set salary=salary+500");
			
			int rs = ps.executeUpdate();
			
			if(rs>0)
				System.out.println("Updated...");
			else 
				System.out.println("Failed..");
		
		}catch(SQLException s) {
			System.out.println(s.getMessage());
		}
	}
}
