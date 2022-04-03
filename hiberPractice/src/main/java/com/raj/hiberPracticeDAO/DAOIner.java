package com.raj.hiberPracticeDAO;

import java.util.List;

import com.raj.hiberPracticeBean.Student;
import com.raj.hiberPracticeException.StudentException;

public interface DAOIner {

	public boolean addStudent(Student s) throws StudentException;
	
	public boolean deleteStudent(int roll) throws StudentException;
	
	public Student findStudent(int roll) throws StudentException;
	
	public boolean updateName(int roll,String name) throws StudentException;
	
	public List<Student> findallStudent();
	
	public List<Student> searchNonPrimary(String city);
	
	
	
}
