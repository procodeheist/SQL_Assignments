package hibernateDAO;

import java.util.List;

import hibernateBean.Employee;

public interface HibernateDAOInterface {
	
	public boolean addEmployee(Employee emp); 

	public List<Employee> getAllEmployee();

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String[] getNameAndAddress(int empId);

}
