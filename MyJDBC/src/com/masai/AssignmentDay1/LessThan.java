package com.masai.AssignmentDay1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LessThan {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
	
		try(Connection conn = DriverManager.getConnection(url, "root","Raj@4317.")){
			 
			PreparedStatement ps = conn.prepareStatement("select * from employee where salary<80000");
		
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int eid = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				System.out.println("Employee Id = "+eid);
				System.out.println("Employee Name = "+name);
				System.out.println("Employee Adress = "+address);
				System.out.println("Employee Salary = "+salary);
				System.out.println("============================");
			}
				
		}catch(SQLException s) {
			System.out.println(s.getMessage());
		}
	}
}
