package jdbcmavenapp1.Dao;

import java.util.List;

import jdbcmavenapp1.BeanS.EmployeeBean;
import jdbcmavenapp1.Exception.EmployeeException;

public interface EmployeeDao {
	
	public EmployeeBean getEmployeeById(int empId)throws EmployeeException;

	public List<EmployeeBean> getAllEmployee();

	public String saveEmployeeDetails(EmployeeBean employee);

	public boolean deleteEmployeeById(int empId)throws EmployeeException;

	public String giveBonusToEmployee(int empId, int amount)throws EmployeeException;
}
