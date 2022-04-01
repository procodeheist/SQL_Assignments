package EmployeeUSE;

import java.util.Scanner;

import EmpException.EmployeeException;
import EmployeeBean.Employee;
import EmployeeDAO.EmpDaoImpl;
import EmployeeDAO.EmployeeDAOInter;

public class DeleteEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the employee id to delete details:");
		int eid = scan.nextInt();


		EmployeeDAOInter employee = new EmpDaoImpl();
		String emp;
		try {
			emp = employee.deleteEmployee(eid);
			System.out.println(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		

	}

}
