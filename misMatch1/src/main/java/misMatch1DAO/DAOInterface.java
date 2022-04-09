package misMatch1DAO;

import misMatch1Bean.Deptartment;
import misMatch1Bean.Employee;

public interface DAOInterface {
	public String addEmployee(Employee emp);
	public String addDept(Employee emp);
	public String displayEmployee(Deptartment dept);
	public String displayDept(Deptartment dept);

}
