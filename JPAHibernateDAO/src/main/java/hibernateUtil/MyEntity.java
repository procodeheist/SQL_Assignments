package hibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntity {

	public static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("FinalAssignment");
	}
	
	public static EntityManager provideEntityConnection() {
		return emf.createEntityManager();
	}
}
