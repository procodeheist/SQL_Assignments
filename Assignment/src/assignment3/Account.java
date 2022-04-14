package assignment3;

public class Account {
	
	private int accountId;
	private int balance;
	private String accountType;
	

	public Account() {
		// TODO Auto-generated constructor stub
	}


	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public Account(int accountId, int balance, String accountType) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.accountType = accountType;
	}

	public boolean withdraw(int amount) {
		boolean res = false;
			if(this.balance >= amount) {
				this.balance = this.balance - amount;
				System.out.println("Balance amount after withdraw: "+ this.balance);
				res = true;
			}
			else{
				System.out.println("Sorry!!! No enough balance");
			}
		
		return res;
	}
}
