package hibernateAppUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManager {

	public static EntityManagerFactory createdEMF;
	
	static {
		createdEMF = Persistence.createEntityManagerFactory("StudentUnit");
	}
	
	public static EntityManager createEM() {
		return createdEMF.createEntityManager();
	}
}
