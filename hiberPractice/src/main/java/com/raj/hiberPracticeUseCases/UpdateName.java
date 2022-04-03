package com.raj.hiberPracticeUseCases;

import java.util.Scanner;

import com.raj.hiberPracticeDAO.DAOIner;
import com.raj.hiberPracticeDAO.StudentDAOimpl;
import com.raj.hiberPracticeException.StudentException;

public class UpdateName {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Id:");
		int roll = scan.nextInt();
		
		System.out.println("Enter the name to be updated:");
		String updateName = scan.next();
		
		DAOIner myDAO = new StudentDAOimpl();
		
		try {
			boolean res =myDAO.updateName(roll, updateName);
			if(res)
				System.out.println("Updated...");
		} catch (StudentException e) {
			
			System.out.println(e.getMessage());
		} 
		scan.close();

	}

}
