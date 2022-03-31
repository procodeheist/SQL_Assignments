package com.masai.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
	
	private int num=10;

	public static void main(String[] args) {
		
//		 try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		 
//		 String url = "jdbc:mysql://localhost:3306/rajDb";
//		
//		 try (Connection conn = DriverManager.getConnection(url,"root","Raj@4317.")){
//			 
//			 
//			 
//			 
//			 
//			if(conn != null) {
//				 System.out.println("working");
//			 }
//			else {
//				System.out.println("not working");
//			}
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} 
//		 
		 Main obj = new Main();
		 obj.practice1();
		 obj.practice();
		 
		 System.out.println(obj.num);
		 

	}

	public void practice() {
		num = 12;
		System.out.println(num);
	}
	
	public void practice1() {
		num = 13;
		System.out.println(num);
	}
}
