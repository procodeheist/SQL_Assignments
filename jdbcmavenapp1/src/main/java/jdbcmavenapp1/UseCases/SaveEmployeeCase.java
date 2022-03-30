package jdbcmavenapp1.UseCases;

import java.util.Scanner;

import jdbcmavenapp1.BeanS.EmployeeBean;
import jdbcmavenapp1.Dao.EmployeeDao;
import jdbcmavenapp1.Dao.EmployeeDaoImpl;

public class SaveEmployeeCase {
	public static void main(String[] args) {
		EmployeeDao emp = new EmployeeDaoImpl();
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id:");
		int empId = scan.nextInt();
		
		System.out.println("Enter the Employee Name:");
		String name = scan.next();
		
		System.out.println("Enter the Employee Adress:");
		String address = scan.next();
		
		System.out.println("Enter the Employee Salary:");
		int salary = scan.nextInt();
		
		String res = emp.saveEmployeeDetails(new EmployeeBean(empId,name,address,salary));
		
		System.out.println(res);
	}
}
