package jdbcmavenapp1.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbcmavenapp1.BeanS.EmployeeBean;
import jdbcmavenapp1.Exception.EmployeeException;
import jdbcmavenapp1.Util.ConnectionClass;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public EmployeeBean getEmployeeById(int empId) throws EmployeeException {

		EmployeeBean emp = null;

		try (Connection conn = ConnectionClass.connect()) {

			PreparedStatement ps = conn.prepareStatement("select * from employee where eid=?");
			ps.setInt(1, empId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int empID = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");

				emp = new EmployeeBean(empID, name, address, salary);
			} else {
				throw new EmployeeException("Employee Not Found");
			}

		} catch (SQLException s) {
			throw new EmployeeException(s.getMessage());
		}

		return emp;
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {

		List<EmployeeBean> employeeList = new ArrayList<>();

		try (Connection conn = ConnectionClass.connect()) {

			PreparedStatement ps = conn.prepareStatement("select * from employee");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int empID = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");

				EmployeeBean emp = new EmployeeBean(empID, name, address, salary);
				employeeList.add(emp);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return employeeList;
	}

	@Override
	public String saveEmployeeDetails(EmployeeBean employee) {

		String result = "Not Inserted..";
		
		try(Connection conn = ConnectionClass.connect()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3,employee.getAddress());
			ps.setInt(4,employee.getSalary());
			
			int r = ps.executeUpdate();
			
			if(r>0) {
				result = "insterted...";
			}
			
			
		} catch (SQLException e) {
			result = e.getMessage(); 
		}
		
		
		
		return result;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		boolean result = false;
		
		try (Connection conn = ConnectionClass.connect()) {

			PreparedStatement ps = conn.prepareStatement("delete from employee where eid=?");
			ps.setInt(1, empId);

			int r = ps.executeUpdate();
			
			if(r>0) {
				result = true;
			}
			else {
				throw new EmployeeException("Employee not found");
			}

			

		} catch (SQLException s) {
			throw new EmployeeException(s.getMessage());
		}

		return result;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		
		String result = "Employee Not Found";
		
		
		try(Connection conn = ConnectionClass.connect()){
			
			PreparedStatement ps = conn.prepareStatement("update employee set salary = salary+? where eid =?");
			ps.setInt(1, amount);
			ps.setInt(2, empId);
			
			int res = ps.executeUpdate();
			
			if(res>0) {
				result = "Bonus provided...";
			}
			else {
				throw new EmployeeException("Employee not found");
			}
			
		}catch(SQLException s) {
			throw new EmployeeException(s.getMessage());
		}

		return result;
	}

}
