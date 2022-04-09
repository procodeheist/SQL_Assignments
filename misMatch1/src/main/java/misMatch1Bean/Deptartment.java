package misMatch1Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deptartment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String deptName;
	private int deptID;
	private String location;

	public Deptartment() {
		
	}

	public Deptartment(String deptName, int deptID, String location) {
		super();
		this.deptName = deptName;
		this.deptID = deptID;
		this.location = location;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

}
