package assignment1;

public class Employee {

	private int empID;
	private String empName;
	private double salary;
	private double netSalary;
	public Employee() {
		
	}
	public Employee(int empID, String empName, double salary, double netSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.netSalary = netSalary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public void calculateNetSalary(int pfPercentage) {
		this.netSalary = salary - salary*((double)pfPercentage/(double)100.0);
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + ", netSalary=" + netSalary
				+ "]";
	}
	

}
