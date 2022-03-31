package jdbcmavenapp1.UseCases;

import java.util.Scanner;

import jdbcmavenapp1.BeanS.EmployeeBean;
import jdbcmavenapp1.Dao.EmployeeDao;
import jdbcmavenapp1.Dao.EmployeeDaoImpl;
import jdbcmavenapp1.Exception.EmployeeException;

public class GiveBonus {

	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee Id to Give Bonus:");
		int empId = scan.nextInt();
		System.out.println("Enter the Bonus Amount:");
		int bonus = scan.nextInt();
		
		
		try {
			String res = emp.giveBonusToEmployee(empId,bonus);
			System.out.println(res);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
