package com.raj.hiberPracticeBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	private int rollNo;
	
	
	private String name;
	
	
	private int age;
	
	
	private String address;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, int age, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
}
