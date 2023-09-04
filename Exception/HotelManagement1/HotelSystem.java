package Hotelmanagement1;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
public class HotelSystem {
	private Hotel hotel;
	public HotelSystem()
	{
		hotel=new Hotel();
	}
	
	public void displayGuests() {
	    System.out.println("List of Guests:");
	    for (Guest guest : hotel.getAllGuests()) {
	        System.out.println("Name: " + guest.getName() + ", Phone: " + guest.getPhoneNumber());
	    }
	}
	
	public void displayReservations() {
	    System.out.println("List of Reservations:");
	    for (Reservation reservation : hotel.getAllReservations()) {
	        if (reservation instanceof RoomReservation) {
	            RoomReservation roomReservation = (RoomReservation) reservation;
	            System.out.println("Type: Room, Guest: " + roomReservation.getGuest().getName()
	                + ", Room Number: " + roomReservation.getRoom().getRoomNo()
	                + ", Check-In Date: " + roomReservation.getCheckedInDate()
	                + ", Check-Out Date: " + roomReservation.getCheckedInDate());
	        } else if (reservation instanceof EventHallReservation) {
	            EventHallReservation eventHallReservation = (EventHallReservation) reservation;
	            System.out.println("Type: Event Hall, Guest: " + eventHallReservation.getGuest().getName()
	                + ", Event Name: " + eventHallReservation.getEventName()
	                + ", Event Date: " + eventHallReservation.getEventDate());
	        } else if (reservation instanceof SpaReservation) {
	            SpaReservation spaServiceReservation = (SpaReservation) reservation;
	            System.out.println("Type: Spa Service, Guest: " + spaServiceReservation.getGuest().getName()
	                + ", Service Type: " + spaServiceReservation.getSpaServiceType()
	                + ", Reservation Date: " + spaServiceReservation.getReservationDate());
	        }
	    }
	}
	
	public RoomReservation findRoomByNumber(int roomNumber) {
        for (RoomReservation room : hotel.getAllRooms()) {
            if (room.getRoomNo() == roomNumber) {
                return room;
            }
        }
        return null; 
    }


	public static Date parseDate(String dateString) throws ParseException {
        String formatPattern = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat(formatPattern);
        return dateFormat.parse(dateString);
    }
	
	
	public void run() throws ParseException {
		Scanner sc = new Scanner(System.in);
	    while (true) {
	        System.out.println("\nHotel Management System Menu: \n 1. Add Guest \n 2. Make Reservation\n 3. Display Guests \n 4. Display Reservations \n 5. Exit");
	        System.out.print("Enter your choice: ");
	        int option=sc.nextInt();
	        sc.nextLine();
	       switch(option)
	        {
	       case 1:
	    	   System.out.println("Enter the guest name: ");
	    	   String name=sc.nextLine();
	    	   System.out.println("Enetr the age of the guest: ");
	    	   int age=sc.nextInt();
	    	   sc.nextLine();
	    	   System.out.println("Enetr the phone number :");
	    	   String phone=sc.next();
	    	   Guest g=new Guest(name,age,phone);
	    	   hotel.addGuests(g);
	    	   System.out.println("Guest added successfully");
	    	   break;
	       case 2:
	    	   System.out.println("Enter the guest name: ");
	    	   String name1=sc.nextLine();
	    	   System.out.println("Enetr the age of the guest: ");
	    	   int age1=sc.nextInt();
	    	   sc.nextLine();
	    	   System.out.println("Enetr the phone number :");
	    	   String phone1=sc.next();
	    	   Guest g1=new Guest(name1,age1,phone1);
	    	   System.out.println("Enter Room number");
	    	   int roomNo=sc.nextInt();
	    	   RoomReservation roomReservation=findRoomByNumber(roomNo);
	    	   if (roomReservation != null) {
	    	        System.out.print("Enter Check-In Date (yyyy-MM-dd): ");
	    	        String checkInDateString = sc.nextLine();
	    	        Date checkInDate = parseDate(checkInDateString);

	    	        System.out.print("Enter Check-Out Date (yyyy-MM-dd): ");
	    	        String checkOutDateString = sc.nextLine();
	    	        Date checkOutDate = parseDate(checkOutDateString);

	    	        try {
	    	            RoomReservation roomReservation1 = new RoomReservation(g1, roomReservation, checkInDate, checkOutDate);
	    	            hotel.makeReservation(roomReservation);
	    	            System.out.println("Room reservation made successfully!");
	    	        } catch (InvalidReservationException e) {
	    	            System.out.println("Error: " + e.getMessage());
	    	        }
	    	    } else {
	    	        System.out.println("Room not found.");
	    	    }
	    	    break;
	    
	    case 3:
            displayGuests();
            break;
        case 4:
            displayReservations();
            break;
        case 5:
            System.out.println("Exiting Hotel Management System. Goodbye!");
            sc.close();
            System.exit(0);
            break;
        default:
            System.out.println("Invalid choice. Please select a valid option.");
	        }
		
	    }
	}

	

}



}
