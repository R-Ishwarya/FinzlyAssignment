package Hotelmanagement1;

public interface Reservation {
	void makeReservation() throws InvalidReservationException;

	void cancelReservation();

}
