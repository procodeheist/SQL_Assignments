package EmployeeUSE;

import java.util.Scanner;

import EmpException.EmployeeException;
import EmployeeBean.Employee;
import EmployeeDAO.EmpDaoImpl;
import EmployeeDAO.EmployeeDAOInter;

public class GetEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the employee id to get details:");
		int eid = scan.nextInt();


		EmployeeDAOInter employee = new EmpDaoImpl();
		Employee emp;
		try {
			emp = employee.getEmployeeById(eid);
			System.out.println(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		

	}
}
