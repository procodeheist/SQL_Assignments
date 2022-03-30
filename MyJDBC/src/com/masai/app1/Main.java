package com.masai.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {

	public static void main(String[] args) {
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		 
		 String url = "jdbc:mysql://localhost:3306/rajDb";
		
		 try (Connection conn = DriverManager.getConnection(url,"root","Raj@4317.")){
			 
			 
			 
			 
			 
			if(conn != null) {
				 System.out.println("working");
			 }
			else {
				System.out.println("not working");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
		 
		 

	}

}
