package hibernateUseCases;

import java.util.Scanner;
import hibernateDAO.DAOImplements;
import hibernateDAO.HibernateDAOInterface;

public class GetAddressAndName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HibernateDAOInterface hiberDAO = new DAOImplements();
		
		
		System.out.println("Enter employee ID to get address and name");
		int empID = scan.nextInt();

		String[] res = hiberDAO.getNameAndAddress(empID);
		System.out.println(res[0]+" "+res[1]);
	}

}
