package hibernateDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import hibernateBean.Employee;
import hibernateUtil.MyEntity;

public class DAOImplements implements HibernateDAOInterface {

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empDetails = null;
		
		EntityManager em = MyEntity.provideEntityConnection();
		
		String jpql = "select a from Employee a";
		
		TypedQuery<Employee> empList = em.createQuery(jpql, Employee.class);
		empDetails = empList.getResultList();
		
		em.close();
		
		return empDetails;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		
		String res = null;
		EntityManager em = MyEntity.provideEntityConnection();
		
		String jqpl = "select address from Employee where empId = :id";
		
		TypedQuery<String> myQ = em.createQuery(jqpl,String.class);
		myQ.setParameter("id", empId);
		
		em.getTransaction().begin();
		res =  myQ.getSingleResult();
		em.getTransaction().commit();
		
		em.close();
		return res;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		
		return null;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		EntityManager em = MyEntity.provideEntityConnection();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			em.de
		}
		
		em.close();
		
		return true;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		
		return null;
	}

	@Override
	public boolean addEmployee(Employee emp) {
		boolean result = true;
		
		EntityManager em = MyEntity.provideEntityConnection();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		em.close();
		return result;
	}

}
