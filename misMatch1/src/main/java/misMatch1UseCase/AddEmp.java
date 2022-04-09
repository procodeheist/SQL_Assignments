package misMatch1UseCase;

import misMatch1Bean.Employee;
import misMatch1DAO.DAOImple;
import misMatch1DAO.DAOInterface;

public class AddEmp {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmpName("Rajasekar");
		emp.setAddress("Chennai");
		emp.setSalary(80000);
		
		DAOInterface dao = new DAOImple();
		System.out.println(dao.addEmployee(emp));
		

	}

}
