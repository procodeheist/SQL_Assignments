package assignment3;

import java.util.Scanner;

public class AccountDetails {
	public static Account getAccountDetails() {
		Account acc = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter account id:");
		int id = scan.nextInt();
		
		System.out.println("Enter account type:");
		String accountType = scan.next();
		
		System.out.println("Enter balance:");
		int balance = scan.nextInt();
		while(true) {
			if(balance<=0) {
				System.out.println("Balance should be positive");
				System.out.println("Enter balance:");
				balance = scan.nextInt();
			}
			else {
				break;
			}
		}
		
;
		
		acc = new Account(id, balance, accountType);
		return acc;
	}

	public static int getWithdrawAmount() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter amount to be withdrawn:");
		int withdrawnAmount = scan.nextInt();
		
		while(true) {
			if(withdrawnAmount<=0) {
				System.out.println("Amount should be positive");
				System.out.println("Enter amount to be withdrawn:");
				withdrawnAmount = scan.nextInt();
			}else {
				break;
			}
		}
		return withdrawnAmount;
	}
	public static void main(String[] args) {
		
		Account acc = getAccountDetails();
		acc.withdraw(getWithdrawAmount());
		
	}

}
