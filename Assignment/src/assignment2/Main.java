package assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the available tickets:");
		int ticketAvailable =scan.nextInt();
		System.out.println("Enter the ticketid:");
		int ticketID = scan.nextInt();
		System.out.println("Enter the no of tickets:");
		int ticketNum = scan.nextInt();
		System.out.println("Enter the price:");
		int ticketPrice = scan.nextInt();
		
		Ticket tick = new Ticket(ticketID,ticketPrice);
		Ticket.setAvailableTickets(ticketAvailable);
		
		int res = tick.calculateTicketCost(ticketNum);
		System.out.println("Total amount: "+res);
		System.out.println("Available ticket after booking: "+Ticket.getAvailableTickets());
		
		
	}

}
