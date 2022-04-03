package com.raj.hiberPracticeUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManager {
	
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hiberPractice");
    
    public static EntityManager provideEntityManager() {
    	return emf.createEntityManager();
    }
   
}
