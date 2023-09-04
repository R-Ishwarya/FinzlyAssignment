package Hotelmanagement1;
import java.util.List;
import java.util.ArrayList;
public class Hotel {
	private List<Guest> guests;
	private List<Reservation> reservations;
	private List<RoomReservation> room;
	private List<EventHallReservation> eventHall;
	private List<SpaReservation> spaReserve;
	
	public Hotel() {
		guests=new ArrayList<>();
		reservations=new ArrayList<>();
		room=new ArrayList<>();
		eventHall=new ArrayList<>();
		spaReserve=new ArrayList<>();
	}
	
	public void addGuests(Guest guest)
	{
		guests.add(guest);
	}
	
	public void removeGuest(Guest guest)
	{
		guests.remove(guest);
	}
	
	public void addRoom(RoomReservation rooms) {
        room.add(rooms);
    }

    public void addEventHall(EventHallReservation eventHalls) {
        eventHall.add(eventHalls);
    }

    public void addSpaService(SpaReservation spaServices) {
        spaReserve.add(spaServices);
    }
	
	public void makeReservation(Reservation reservation) throws InvalidReservationException
	{
		reservation.makeReservation();
		reservations.add(reservation);
	}
	
	public void cancelReservation(Reservation reservation) {
	    reservations.remove(reservation);
	}
	
	public List<Guest> getAllGuests() {
        return guests;
    }
	
	public List<Reservation> getAllReservations()
	{
		return reservations;
	}
	
	public List<RoomReservation> getAllRooms() {
        return room;
    }

    public List<EventHallReservation> getAllEventHalls() {
        return eventHall;
    }

    public List<SpaReservation> getAllSpaServices() {
        return spaReserve;
    }
    
    public RoomReservation findReservationById(int reservationId) {
        for (RoomReservation reservations : room) {
            if (reservations.getReservationId() == reservationId) {
                return reservations;
            }
        }
        return null; 
    }

	public int addRoom(int roomNumber) {
		return roomNumber;
		
	}
}
