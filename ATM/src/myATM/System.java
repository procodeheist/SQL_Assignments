package myATM;
/*
 * Assumptions:
 * Other Banks card wont work;
 * Manager can refill and collect money;
 * System has only one manager for convention;
 * */
enum Message{DepositSuccess,TranscationFailed,InsufficientBalance,
	CardExpired,ContactBranch,ATMOutOfService,AmountCredited}


class Card{
	private String name;
	private int cardNumber;
	
}
class ReadCard{
	private Card card;
	private Message message;
	private double balance;
	
	public  Message authenticate(Card card) {
		return Message.CardExpired;
	}
}
class CashDispenser{
	ReadCard readCard;
	public int dispenseCash() {
		return 0;
	}
}
class DepositCash{
	ReadCard readCard;
	
	public Message depositCash() {
		return Message.DepositSuccess;
	}
}
class Screen{
	Message message;
	void displayMessage(Message message) {
		
	}
}
class KeyPad{
	int[][] keys;
	
}
class Reciept{
	Message message;
	void createReciept(Message message){
		
	}
}
class Printer{
	Reciept reciept;
	void printReciept(Reciept reciept) {
		
	}
}
class User{
	Card card;
	void deposit(Card card) {
		
	}
	void withDraw(Card card) {
		
	}
}
class Manager{
	String key;
	void refillATM(String key) {
		
	}
	void collectFromATM(String key) {
		
	}
}
public class System {
	ReadCard readCard;
	CashDispenser cashDispenser;
	DepositCash cashDeposit;
	Printer print;
	KeyPad keys;
	User user;
	Manager manager;
}
