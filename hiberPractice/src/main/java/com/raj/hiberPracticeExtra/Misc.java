package com.raj.hiberPracticeExtra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.raj.hiberPracticeBean.Student;
import com.raj.hiberPracticeUtil.MyEntityManager;

public class Misc {

	public static void main(String[] args) {
		
		EntityManager em = MyEntityManager.provideEntityManager();
		
		String jpql = "select name,age from Student where address='chennai'";
		
		TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
		
		List<Object[]> studentList = query.getResultList();
		
		System.out.println("Done........");
		
		studentList.stream().forEach(std->{
			System.out.println(std[0]);
			System.out.println(std[1]);
		});
		
		em.close();
	}

}
