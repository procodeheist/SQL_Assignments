package EmployeeUSE;

import java.util.Scanner;

import EmployeeBean.Employee;
import EmployeeDAO.EmpDaoImpl;
import EmployeeDAO.EmployeeDAOInter;

public class SaveEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the employee id:");
		int eid=scan.nextInt();
		
		System.out.println("Enter the employee name:");
		String name=scan.next();
		
		System.out.println("Enter the employee address:");
		String address=scan.next();
		
		System.out.println("Enter the employee salary:");
		int salary=scan.nextInt();
		
		
		EmployeeDAOInter employee = new EmpDaoImpl();
		String res = employee.saveEmployeeDetails(new Employee(eid,name,address,salary));
		
		System.out.println(res);

	}

}
