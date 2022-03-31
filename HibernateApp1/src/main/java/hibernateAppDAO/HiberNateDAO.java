package hibernateAppDAO;



import hibernateAppBean.Student;


public interface HiberNateDAO {

	public String addStudentDetails(Student student) throws Exception;
	
	public String updateGraceMark();
	
	public Student getStudentDetails();
}
