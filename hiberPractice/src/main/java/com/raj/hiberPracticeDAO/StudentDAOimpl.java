package com.raj.hiberPracticeDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.raj.hiberPracticeBean.Student;
import com.raj.hiberPracticeException.StudentException;
import com.raj.hiberPracticeUtil.MyEntityManager;

public class StudentDAOimpl implements DAOIner {

	@Override
	public boolean addStudent(Student student) throws StudentException {
		
		boolean flag=true;
		EntityManager em = MyEntityManager.provideEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(student);
			em.getTransaction().commit();
		}catch(Exception s) {
			throw new StudentException("Student Roll Number already exist");
		}
		
		em.close();
		
		return flag;
	}

	@Override
	public boolean deleteStudent(int roll) throws StudentException {
		
		EntityManager em = MyEntityManager.provideEntityManager();
		
		Student student = em.find(Student.class, roll);
		
		if(student != null) {
			em.getTransaction().begin();
			em.remove(student);
			em.getTransaction().commit();
		}
		else {
			throw new StudentException("Student not found");
		}
		em.close();
		return true;
	}

	@Override
	public Student findStudent(int roll) throws StudentException {
		
		EntityManager em = MyEntityManager.provideEntityManager();
		
		Student student = em.find(Student.class, roll);
		
		em.close();
		return student;
	}

	@Override
	public boolean updateName(int roll, String name) throws StudentException {
		
		EntityManager em= MyEntityManager.provideEntityManager();
		
		Student findStudent = em.find(Student.class, roll);
		if(findStudent != null) {
			em.getTransaction().begin();
			findStudent.setName(name);
			em.getTransaction().commit();
		}
		else {
			throw new StudentException("Student not found");
		}
		em.close();
		return true;
	}
	

	@Override
	public List<Student> findallStudent() {
		
		List<Student> studentList = null;
		EntityManager em= MyEntityManager.provideEntityManager();
		
		String jpql = "select a from Student a";
		
		Query myQuery = em.createQuery(jpql,Student.class);
		
		studentList = myQuery.getResultList();
		
		
		em.close();
		return studentList;
	}

	@Override
	public List<Student> searchNonPrimary(String city){
		List<Student> resultList=null;
		
		EntityManager em = MyEntityManager.provideEntityManager();
		
		String jpql = "select a from Student a where a.address=?1";
		
		
		TypedQuery<Student> typeQuery = em.createQuery(jpql,Student.class);
		typeQuery.setParameter(1, city);
		
		resultList = typeQuery.getResultList();
		em.close();
		
		return resultList;
	};
		
	

}
