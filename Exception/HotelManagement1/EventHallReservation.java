package Hotelmanagement1;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EventHallReservation implements Reservation{
	private static List<EventHallReservation> reservations = new ArrayList<>();
	private Rooms room;
	private Date eventDate;
	private String eventName;
	private boolean isConfirmed;
	private static int reservationCounter=1;
	private int reservationId;
	private Guest guest;
	
	public EventHallReservation(int reservationId, Guest guest, Date eventDate,String eventName, boolean isConfirmed) {
		
		this.reservationId = reservationCounter++;
		this.guest = guest;
		this.eventDate = eventDate;
		this.eventName=eventName;
		this.isConfirmed = false;
	}


	public static List<EventHallReservation> getReservations() {
		return reservations;
	}


	public static int getReservationCounter() {
		return reservationCounter;
	}


	public int getReservationId() {
		return reservationId;
	}


	public Guest getGuest() {
		return guest;
	}


	public Date getEventDate() {
		return eventDate;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}
	public String getEventName() {
		return eventName;
	}


	@Override
	public void makeReservation() throws InvalidReservationException {
		if(!isAvailabe(eventDate))
		{
			throw new InvalidReservationException("Event Hall is already booked for the specified date");
		}
		reservations.add(this);
		confirmReservation();
		
	}


	private void confirmReservation() {
		isConfirmed=true;
		
	}


	private boolean isAvailabe(Date date) {
		for (EventHallReservation reserve : reservations) {
            if (reserve.getEventDate().equals(date)) {
                return false; 
            }
		 } 
        
		return true;
	}


	@Override
	public void cancelReservation() {
		if (room != null) {
            room.releaseRoom();
        }
		
	}
}
