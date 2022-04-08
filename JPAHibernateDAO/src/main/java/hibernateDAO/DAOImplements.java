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
		String res = "Bonus added succefully";
		
		EntityManager em = MyEntity.provideEntityConnection();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			emp.setSalary(emp.getSalary()+bonus);
			em.getTransaction().commit();
		}
		else {
			res = "Not added...";
		}
		
		
		
		em.close();
		
		
		return res;
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		boolean flag = true;
		EntityManager em = MyEntity.provideEntityConnection();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
		}else {
			flag = false;
		}
		
		em.close();
		
		return flag;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		 
		String[] empDetails = new String[2];
		
		EntityManager em = MyEntity.provideEntityConnection();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null) {
			empDetails[0] = emp.getName();
			empDetails[1] = emp.getAddress();
		}
		
		
		
		em.close();
		
		
		return empDetails;
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
