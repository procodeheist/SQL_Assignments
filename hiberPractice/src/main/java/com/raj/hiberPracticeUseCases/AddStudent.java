package com.raj.hiberPracticeUseCases;

import java.util.Scanner;

import com.raj.hiberPracticeBean.Student;
import com.raj.hiberPracticeDAO.DAOIner;
import com.raj.hiberPracticeDAO.StudentDAOimpl;
import com.raj.hiberPracticeException.StudentException;

public class AddStudent {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String name = scan.next();
		
		System.out.println("Enter Student Address");
		String address = scan.next();
		
		System.out.println("Enter Student Roll No");
		int roll = scan.nextInt();
		
		System.out.println("Enter Student Age");
		int age = scan.nextInt();
		
		DAOIner studentDao = new StudentDAOimpl();
		
		try {
			boolean res = studentDao.addStudent(new Student(roll,name,age,address));
			
			if(res)
				System.out.println("Added Successfully....");
			
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
		
	}

}
