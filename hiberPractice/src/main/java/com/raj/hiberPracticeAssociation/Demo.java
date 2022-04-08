package com.raj.hiberPracticeAssociation;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import com.raj.hiberPracticeUtil.MyEntityManager;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em=MyEntityManager.provideEntityManager();
			
		TrEmployee emp=em.find(TrEmployee.class, 2);
		
		//List<TrEmployee> emps= dept.getEmp();
		
//		emps.forEach(e ->{
//			
//			
//		});
		
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDept().getLocation());
		System.out.println(emp.getDept().getDeptName());
		System.out.println("========================");
		
		System.out.println("done...");
		
		}
}
