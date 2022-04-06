package com.raj.hiberPracticeExtra;

import java.util.Set;

import javax.persistence.EntityManager;

import com.raj.hiberPracticeUtil.MyEntityManager;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em= MyEntityManager.provideEntityManager();
		
		
		MiscEmployee emp= em.find(MiscEmployee.class, 2);
 		
 		// even though before closing the EM obj we got the Employee obj
		//here only Employee related obj will be loaded ,address obj data will be not be loaded
			//so while fetching the address related data we will get an exception
		
 		System.out.println(emp.getEid());
 		System.out.println(emp.getName());
 		System.out.println(emp.getSalary());
 		
 		System.out.println("All Address are:-");
 		
 		System.out.println("===========================");
 		Set<MiscAddress> addreses= emp.getAddresses();
 		
 		
 		for(MiscAddress ad:addreses){
 			System.out.println("city :"+ad.getCity());
 			System.out.println("Country :"+ad.getCountry());
 			System.out.println("Pincode :"+ad.getPincode());
 			
 			System.out.println("***************************");
 		}
 		em.close();
 		
		System.out.println("done...");
	}

}
