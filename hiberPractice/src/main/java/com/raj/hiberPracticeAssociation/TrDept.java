package com.raj.hiberPracticeAssociation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class TrDept {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int deptID;
	private String deptName;
	private String location;
	
	@OneToMany(mappedBy="dept", cascade = CascadeType.ALL)
	private List<TrEmployee> emp = new ArrayList<>();
	

	 public List<TrEmployee> getEmp() {
		return emp;
	}

	public void setEmp(List<TrEmployee> emp) {
		this.emp = emp;
	}

	public TrDept() {
		
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



	
}
