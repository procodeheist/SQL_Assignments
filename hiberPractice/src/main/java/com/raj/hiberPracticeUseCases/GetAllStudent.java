package com.raj.hiberPracticeUseCases;

import java.util.List;

import com.raj.hiberPracticeBean.Student;
import com.raj.hiberPracticeDAO.DAOIner;
import com.raj.hiberPracticeDAO.StudentDAOimpl;

public class GetAllStudent {

	public static void main(String[] args) {
		
		DAOIner myDAO = new StudentDAOimpl();
		
		List<Student> studentList = myDAO.findallStudent();
		
		System.out.println("==================================");
		for(Student std:studentList) {
			System.out.println("Student Roll No: "+std.getRollNo());
			System.out.println("Student Name: "+std.getName());
			System.out.println("Student Age: "+std.getAge());
			System.out.println("Student Address: "+std.getAddress());
			System.out.println("==================================");
		}
		

	}

}
