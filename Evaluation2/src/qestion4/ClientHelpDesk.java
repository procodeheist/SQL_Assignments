package qestion4;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class ClientHelpDesk {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter denominations to know paper size:");
		int denomination = scan.nextInt();
		
		try {
			String paperSize = NoteFactory.printNote(denomination);
			System.out.println("The required paper size is: "+paperSize);
		} catch (InvalidAlgorithmParameterException e) {
			
			System.out.println(e.getMessage());
		}
		
		scan.close();

	}

}
