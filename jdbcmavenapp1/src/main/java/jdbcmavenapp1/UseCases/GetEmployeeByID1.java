package jdbcmavenapp1.UseCases;

import java.util.Scanner;

import jdbcmavenapp1.BeanS.EmployeeBean;
import jdbcmavenapp1.Dao.EmployeeDao;
import jdbcmavenapp1.Dao.EmployeeDaoImpl;
import jdbcmavenapp1.Exception.EmployeeException;

public class GetEmployeeByID1 {

	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee Id to get details:");
		int empId = scan.nextInt();
		
		try {
			EmployeeBean res = emp.getEmployeeById(empId);
			System.out.println(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
