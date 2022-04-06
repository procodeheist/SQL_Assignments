package com.raj.hiberPracticeExtra;


import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.Generated;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;


@Entity
public class MiscEmployee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String name;
	private int salary;
	
	@ElementCollection(fetch= FetchType.EAGER)
	@Embedded
	@JoinTable(name="Employee_addresses",joinColumns=@JoinColumn(name="emp_id"))
	private Set<MiscAddress> addresses = new HashSet<>();

	public MiscEmployee() {
		
	}

	

	public Set<MiscAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<MiscAddress> addresses) {
		this.addresses = addresses;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


}
