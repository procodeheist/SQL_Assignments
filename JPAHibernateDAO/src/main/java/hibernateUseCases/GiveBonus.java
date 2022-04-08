package hibernateUseCases;

import java.util.Scanner;
import hibernateDAO.DAOImplements;
import hibernateDAO.HibernateDAOInterface;

public class GiveBonus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HibernateDAOInterface hiberDAO = new DAOImplements();
		System.out.println("Enter employee ID to provide bonus:");
		int empID = scan.nextInt();
		System.out.println("Enter the bonus amount to be added");
		int bonus = scan.nextInt();
		

		String res = hiberDAO.giveBonusToEmployee(empID, bonus);
		System.out.println(res);
	}

}
