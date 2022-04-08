package hibernateUseCases;

import java.util.Scanner;

import hibernateBean.Employee;
import hibernateDAO.DAOImplements;
import hibernateDAO.HibernateDAOInterface;

public class AddNewEmployee {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the employee details below");
		System.out.println("Enter the employee name:");
		String name = scan.next();
		System.out.println("Enter the employee address:");
		String address = scan.next();
		System.out.println("Enter the employee salary");
		int salary = scan.nextInt();
		
		Employee newEmp = new Employee();
		newEmp.setName(name);
		newEmp.setAddress(address);
		newEmp.setSalary(salary);
		
		
		HibernateDAOInterface daoHibernate = new DAOImplements();
		
		boolean res = daoHibernate.addEmployee(newEmp);
		
		if(res)
			System.out.println("done...");
		else 
			System.out.println("Not added....");
		
	}

}
