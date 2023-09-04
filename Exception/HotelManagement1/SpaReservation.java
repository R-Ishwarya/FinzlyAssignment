package Hotelmanagement1;
import java.sql.Date;
import java.util.*;
import java.lang.*;

public class SpaReservation implements Reservation{
	private static List<SpaReservation> reservations = new ArrayList<>();
	
	SpaReservation reservation;
	private static int reservationCounter=1;
	private int reservationId;
	private Guest guest;
	private Rooms room;
	private SpaServiseType spaServiceType;
	private Date reservationDate;
	private boolean isConfirmed;
	
	
	public SpaReservation(Guest guest, SpaServiceType spaServiceType, Date reservationDate) {
		this.reservationId=reservationCounter++;
		this.guest = guest;
		this.spaServiceType = spaServiceType;
		this.reservationDate = reservationDate;
		this.isConfirmed=false;
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


	public SpaServiceType getSpaServiceType() {
		return SpaServiceType;
	}



	public Date getReservationDate() {
		return reservationDate;
	}


	public boolean isConfirmed() {
		return isConfirmed;
	}


	@Override
	public void makeReservation() throws InvalidReservationException {
		if(!isAvailabe(SpaServiceType,reservationDate))
		{
			throw new InvalidReservationException("The selected spa service is not availabe on the specified date");
		}
		reservations.add(this);
		confirmReservation();
	
		
	}

	private void confirmReservation() {
		isConfirmed=true;
		
	}



	private boolean isAvailabe(SpaServiseType spaServiceType, Date date) {
		
		for (SpaReservation reserve : reservations) {
            if (reserve.getReservationDate().equals(date) && reserve.getSpaServiceType() == spaServiceType) {
                return false; // Spa service is already booked for this date and type
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
