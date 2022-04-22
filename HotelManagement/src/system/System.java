package system;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/*
 * Assumption:
 * The hotel has only one branch;
 * The Application is going to be used by guest staying,Registered customers and Non-Registered customers only;
 * Only Registered customers can book rooms;
 * Any one can search rooms from system;
 * */
enum Aminities{
	GymAccess,PoolAccess,PlayArea
}
enum BookingStatus{
	AVAILABLE,NOTAVAILABLE,PENDING,CANCELLED
}
enum PaymentMethod{
	CREDITCARD,CHEQUE,CASH
}
enum Gender{
	Male,Female,Others
}
public class System {
	private List<Rooms> roomsList;
	private List<RegisteredCustomer> registeredCustomers;
	
	void login() {
		
	}
	void register(RegisteredCustomer customer) {
		this.registeredCustomers.add(customer);
	}
	void logOut() {
		
	}
}

abstract class Rooms{
	private List<Date> availableDate;
	abstract void openRoom();
	abstract void closeRoom();
}

class StandardRoom extends Rooms{
	private BookingStatus status = BookingStatus.AVAILABLE; 
	private double price;
	
	@Override
	public void openRoom() {
		
		
	}

	@Override
	public void closeRoom() {
		
		
	}
	
}

class DeluxeRoom extends Rooms{
	private double price;
	private BookingStatus status = BookingStatus.AVAILABLE; 
	@Override
	public void openRoom() {
		
		
	}

	@Override
	public void closeRoom() {
		
		
	}
	
}

class FamilyRoom extends Rooms{
	private BookingStatus status = BookingStatus.AVAILABLE; 
	private double price;
	@Override
	public void openRoom() {
		
		
	}

	@Override
	public void closeRoom() {
		
		
	}
	
}
class Booking{
	private Person guest; 
	private List<Rooms> room;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private PaymentMethod payment;
	
	
	
}
abstract class Person{
	private String name;
	private Gender gender;
	private int age;
	private int phoneNum;
	abstract void searchRoom();
}
class Guest extends Person{
	
	private Aminities aminities;

	@Override
	public void searchRoom() {
		
		
	}
	public void addFood() {
		
	}
	public void callRoomServices() {
		
	}
}
class NonRegisteredCustomer extends Person{

	@Override
	public void searchRoom() {
		
		
	}
	
}
class RegisteredCustomer extends Person{
	private Booking book;

	@Override
	public void searchRoom() {
		
		
	}
	
}


