package EmployeeUSE;

import java.util.List;

import EmployeeBean.Employee;
import EmployeeDAO.EmpDaoImpl;
import EmployeeDAO.EmployeeDAOInter;

public class GetAllEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


		EmployeeDAOInter employee = new EmpDaoImpl();
		List<Employee> employeeList = employee.getAllEmployees();
		
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
		

	}
}
