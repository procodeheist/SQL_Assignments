package misMatch1Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MeEntity {

	public static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("misMatch1");
	}
	
	public static EntityManager createMyManager() {
		return emf.createEntityManager();
	}
}
