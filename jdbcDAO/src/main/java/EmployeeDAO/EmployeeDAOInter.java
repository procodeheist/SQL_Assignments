package EmployeeDAO;

import java.util.List;

import EmpException.EmployeeException;
import EmployeeBean.Employee;

public interface EmployeeDAOInter{
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId)throws EmployeeException;
}
