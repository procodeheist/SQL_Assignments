package assignment2;

public class Ticket {
	
	private int ticketId;
	private int price;
	private static int availableTickets;

	
	public Ticket(int ticketId, int price) {
		super();
		this.ticketId = ticketId;
		this.price = price;
	}


	public int getTicketId() {
		return ticketId;
	}


	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public static int getAvailableTickets() {
		return availableTickets;
	}


	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets >= 0) {
			Ticket.availableTickets = availableTickets;
		}
	}


	public Ticket() {
		
	}
	
	public int calculateTicketCost(int noOfTickets) {
		
		int res = -1;
		if(availableTickets >= noOfTickets) {
			availableTickets = availableTickets-noOfTickets;
			res = noOfTickets*price;
		}
		
		return res;
	}

}
