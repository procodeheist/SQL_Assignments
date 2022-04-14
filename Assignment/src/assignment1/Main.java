package assignment1;

import java.util.Scanner;

public class Main {
	public static Employee getEmployeeDetails() {
		
		return new Employee();
	}
	public static int getPFPercentage() {
		return 0;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the employee ID:");
		int empID = scan.nextInt();	
		System.out.println("Enter the employee Name:");
		String empName = scan.next();
		System.out.println("Enter the employee Salary:");
		double salary = scan.nextDouble();	
		System.out.println("Enter the employee PF %:");
		int pf = scan.nextInt();
		
		Employee emp = getEmployeeDetails();
		emp.setEmpID(empID);
		emp.setEmpName(empName);
		emp.setSalary(salary);
		
		emp.calculateNetSalary(pf);
		
		
		System.out.println("Employee ID:"+emp.getEmpID());
		System.out.println("Employee Name:"+emp.getEmpName());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("Employee Net Salary:"+emp.getNetSalary());

	}

}
