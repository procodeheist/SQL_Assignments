package com.raj.hiberPracticeUseCases;

import java.util.List;
import java.util.Scanner;

import com.raj.hiberPracticeBean.Student;
import com.raj.hiberPracticeDAO.DAOIner;
import com.raj.hiberPracticeDAO.StudentDAOimpl;

public class SelectNonPrimary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter city to search employee");
		String city = scan.next();
		
		DAOIner myDAO = new StudentDAOimpl();
		
		List<Student> studentist =  myDAO.searchNonPrimary(city);
		if(studentist.size() > 0)
			System.out.println(studentist);
		else 
			System.out.println("No one from "+city);

	}

}
