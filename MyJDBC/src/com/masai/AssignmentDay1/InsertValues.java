package com.masai.AssignmentDay1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValues {

	public static void main(String[] args) {
		
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			 
		Scanner scan = new Scanner(System.in); 	
		
		System.out.println("Enter the Details of Employee: ");
		
		while(true) {
			System.out.println("Enter the Employee ID:");
			int eid = scan.nextInt();
			
			System.out.println("Enter the Employee Name:");
			String name= scan.next();
			
			System.out.println("Enter the Employee Adress:");
			String adress= scan.next();
			
			System.out.println("Enter the Employee Salary:");
			int salary = scan.nextInt();
			
			String url = "jdbc:mysql://localhost:3306/db1";
			
			try(Connection conn = DriverManager.getConnection(url,"root","Raj@4317.")){
				
				PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
				
				ps.setInt(1, eid);
				ps.setString(2, name);
				ps.setString(3, adress);
				ps.setInt(4,salary);
				
				int x = ps.executeUpdate();
				
				if(x>0)
					System.out.println("Inserted....");
				else 
					System.out.println("Not Inserted");
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Do you want to add more details?(Y/N)");
			String choice = scan.next();
			
			if(choice.equalsIgnoreCase("n"))
				break;
		}
		
		System.out.println("Application Closed");
		

	}

}
