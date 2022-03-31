package hibernateAppUseCase;



import hibernateAppBean.Student;
import hibernateAppDAO.HBDaoImpl;
import hibernateAppDAO.HiberNateDAO;


public class AddStudent {

	public static void main(String[] args) {
		
		HiberNateDAO hbd = new HBDaoImpl();
		String res = null;
		try {
			res = hbd.addStudentDetails(new Student(1, "Raj", 1000));
			System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}
