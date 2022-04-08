package hibernateUseCases;

import java.util.Scanner;
import hibernateDAO.DAOImplements;
import hibernateDAO.HibernateDAOInterface;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateDAOInterface hiberDAO = new DAOImplements();
		System.out.println("Enter employee ID to Delete It");
		Scanner scan = new Scanner(System.in);
		int empID = scan.nextInt();

		boolean res = hiberDAO.deleteEmployee(empID);
		if (res)
			System.out.println("Donee....");
		else
			System.out.println("Not Deleted");
	}

}
