package misMatch1DAO;

import javax.persistence.EntityManager;

import misMatch1Bean.Deptartment;
import misMatch1Bean.Employee;
import misMatch1Util.MeEntity;

public class DAOImple implements DAOInterface {

	@Override
	public String addEmployee(Employee emp) {
		
		String res="Added Successfully";
		
		EntityManager em = MeEntity.createMyManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		em.close();
		return res;
	}

	@Override
	public String addDept(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayEmployee(Deptartment dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayDept(Deptartment dept) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
