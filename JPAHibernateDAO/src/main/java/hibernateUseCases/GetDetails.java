package hibernateUseCases;

import java.util.List;

import hibernateBean.Employee;
import hibernateDAO.DAOImplements;
import hibernateDAO.HibernateDAOInterface;

public class GetDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateDAOInterface hiberDAO = new DAOImplements();
		
		List<Employee> empList = hiberDAO.getAllEmployee();
		
		System.out.println("The Employee Details are:");
		System.out.println("==========================");
		for(Employee emp : empList) {
			System.out.println("Employee Id:"+emp.getEmpID());
			System.out.println("Employee Name:"+emp.getName());
			System.out.println("Employee Address:"+emp.getAddress());
			System.out.println("Employee Salary:"+emp.getSalary());
			System.out.println("=========================");
		}
	}

}
