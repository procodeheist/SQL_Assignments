package jdbcmavenapp1.UseCases;

import java.util.List;

import jdbcmavenapp1.BeanS.EmployeeBean;
import jdbcmavenapp1.Dao.EmployeeDao;
import jdbcmavenapp1.Dao.EmployeeDaoImpl;


public class GetAllEmployee {

	public static void main(String[] args) {
		
		EmployeeDao employee = new EmployeeDaoImpl();
		 
	
		List<EmployeeBean> res = employee.getAllEmployee();
		
		for(EmployeeBean emp: res) {
			System.out.println("Employee ID: "+emp.getEmpId());
			System.out.println("Employee Na,e: "+emp.getName());
			System.out.println("Employee Address: "+emp.getAddress());
			System.out.println("Employee Salary: "+emp.getSalary());
			System.out.println("==================================");
		}

		
	}

}
