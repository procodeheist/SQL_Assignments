package hibernateAppDAO;



import javax.persistence.EntityManager;

import hibernateAppBean.Student;
import hibernateAppException.StudentException;
import hibernateAppUtil.MyEntityManager;

public class HBDaoImpl implements HiberNateDAO{

	@Override
	public String addStudentDetails(Student student) throws Exception {
		String note = "Not Added";
		
		EntityManager em = MyEntityManager.createEM();
		
		em.getTransaction().begin();
		
		em.persist(student);
		note = "Added Successfully";
		
		
		em.getTransaction().commit();
		
		return note;
	}

	@Override
	public String updateGraceMark() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
