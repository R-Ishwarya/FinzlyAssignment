package problem4;
import java.util.Scanner;
public class Room {
	private int roomNumber;
	private int capacity;
	private int pricepernight;
	private String checkindate;
	private String checkoutdate;
	public Room(int roomNumber, int capacity, int pricepernight) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.pricepernight = pricepernight;
	}
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", capacity=" + capacity + ", pricepernight=" + pricepernight
				+ ", checkindate=" + checkindate + ", checkoutdate=" + checkoutdate + "]";
	}
	public void avaliability()
	{
		if (capacity>0)
		{
			System.out.println("Room avaliable");
			
		}else
		{
			System.out.print("There is no room avaliable");
		}
	}
	public void reservation(int members)
	{
		if(members<=capacity || members==capacity)
		{
			System.out.println("The rooms can be reserved for "+ members +" members");
		}else {
			System.out.println("The room is not avaliable for "+ members +" members");
		}
	}
	public void reservation(int members,String checkindate,String checkoutdate)
	{
		if(members<=capacity || members==capacity)
		{
			System.out.println("The rooms can be reserved for "+ members +" members with this checkin and checkout dates");
		}else {
			System.out.println("The room is not avaliable for "+ members +" members with this checkin and checkout dates");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Room o1 = new Room(110,2,500);
		o1.avaliability();
		o1.reservation(4);
		o1.reservation(4,"10-10-2023","12-10-2023");
		Room o2 = new Room(120,4,200);
		o2.avaliability();
		o2.reservation(4);
		o2.reservation(4,"10-10-2023","12-10-2023");
		
		
		
		

	}

}
