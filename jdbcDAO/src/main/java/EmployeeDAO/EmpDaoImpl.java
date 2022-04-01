package EmployeeDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import EmpException.EmployeeException;
import EmployeeBean.Employee;
import EmployeeUtil.MyConnection;

public class EmpDaoImpl implements EmployeeDAOInter {

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String msg = "Employee Not Saved";

		try (Connection conn = MyConnection.connect()) {

			PreparedStatement ps = conn.prepareStatement("insert into employee values (?,?,?,?)");

			ps.setInt(1, employee.getEmpID());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());

			int r = ps.executeUpdate();

			if (r > 0) {
				msg = "Employee Saved Successfully";
			}

		} catch (SQLException e) {

			msg = e.getMessage();
		}

		return msg;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee result = null;
		// TODO Auto-generated method stub
		try (Connection conn = MyConnection.connect()) {

			PreparedStatement ps = conn.prepareStatement("select * from employee where empID = ?");
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("empID");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				result = new Employee(id,name,address,salary);
			}
			else {
				throw new EmployeeException("Employee not found");
			}

			

		} catch (SQLException e) {

			throw new EmployeeException(e.getMessage());
		}

		return result;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
