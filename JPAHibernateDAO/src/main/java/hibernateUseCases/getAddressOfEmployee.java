package hibernateUseCases;

import java.util.Scanner;

import hibernateDAO.DAOImplements;
import hibernateDAO.HibernateDAOInterface;

public class getAddressOfEmployee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Employee ID to find Employee address");
		int empID = scan.nextInt();
		
		HibernateDAOInterface hiberDAO = new DAOImplements();
		String res = hiberDAO.getAddressOfEmployee(empID);
		System.out.println("Adress of employee is "+res);

	}

}
