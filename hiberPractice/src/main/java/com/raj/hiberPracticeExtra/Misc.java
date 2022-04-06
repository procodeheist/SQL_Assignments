package com.raj.hiberPracticeExtra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.raj.hiberPracticeBean.Student;
import com.raj.hiberPracticeException.StudentException;
import com.raj.hiberPracticeUtil.MyEntityManager;

public class Misc {
	public  static boolean employeeFun(MiscEmployee emp){
		
		boolean flag=true;
		EntityManager em = MyEntityManager.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		em.close();
		
		return flag;
	}

	public static void main(String[] args) {
		
		//EntityManager em = MyEntityManager.provideEntityManager();
		
		MiscEmployee newEmp = new MiscEmployee();
		
		newEmp.setName("Raj");
		newEmp.setSalary(80000);
		newEmp.getAddresses().add(new MiscAddress("Chennai", "India", "600012"));
		newEmp.getAddresses().add(new MiscAddress("Bangalore", "India", "635012"));
		
		boolean flag = employeeFun(newEmp);
		
		if(flag)
			System.out.println("Added.....");
		//em.close();
	}

}
