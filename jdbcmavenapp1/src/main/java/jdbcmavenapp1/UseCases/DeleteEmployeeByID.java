package jdbcmavenapp1.UseCases;

import java.util.Scanner;

import jdbcmavenapp1.BeanS.EmployeeBean;
import jdbcmavenapp1.Dao.EmployeeDao;
import jdbcmavenapp1.Dao.EmployeeDaoImpl;
import jdbcmavenapp1.Exception.EmployeeException;

public class DeleteEmployeeByID {

	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee Id to Delete details:");
		int empId = scan.nextInt();
		
		try {
			boolean res = emp.deleteEmployeeById(empId);
			
			if(res)
				System.out.println("Deleted successfully");
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
