package Hotelmanagement1;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public class RoomReservation implements Reservation{
	private static List<RoomReservation> reservations = new ArrayList<>();

	private Guest guest;
	private Rooms room;
	private RoomReservation roomReservation;
	private int roomNo;
	private int reservationId;
	private Date checkedInDate;
	private Date checkedOutDate;
	private boolean isChecked;
	
	
	
	public RoomReservation(Guest guest, RoomReservation roomReservation, Date checkedInDate, Date checkedOutDate) {
		super();
		this.guest = guest;
		this.roomReservation = roomReservation;
		this.reservationId = reservations.size()+1;
		this.checkedInDate = checkedInDate;
		this.checkedOutDate = checkedOutDate;
		this.isChecked=false;
	}

	@Override
    public void cancelReservation() {
        
        if (room != null) {
            room.releaseRoom();
        }
        
    }


	public static List<RoomReservation> getReservations() {
		return reservations;
	}



	public static void setReservations(List<RoomReservation> reservations) {
		RoomReservation.reservations = reservations;
	}



	public Guest getGuest() {
		return guest;
	}



	public Rooms getRoom() {
		return room;
	}



	public int getReservationId() {
		return reservationId;
	}




	public Date getCheckedInDate() {
		return checkedInDate;
	}





	public Date getCheckedOutDate() {
		return checkedOutDate;
	}






	public boolean isChecked() {
		return isChecked;
	}





	@Override
	public void makeReservation() throws InvalidReservationException {
		if(!room.isAvailable())
		{
			throw new InvalidReservationException("Room is already booked");
		}
		if(checkedInDate.after(checkedOutDate))
		{
			throw new InvalidReservationException("Invalid check-in and check-out date");
		}
		
		room.bookRoom();
		
		reservations.add(this);
		
	}
	
	public void checkIn()
	{
		if(!isChecked)
		{
			isChecked=true;
			System.out.println("Checked in successfull");
		}
		else
		{
			System.out.println("Already checked in");
		}
	}
	public void checkOut()
	{
		if(isChecked)
		{
			isChecked=false;
			System.out.println("Checked out sucessfully");
		}
		else
		{
			System.out.println("Not yet checked in");
		}
	}
	
	public static List<RoomReservation> getAllReservation()
	{
		return reservations;
	}

	public int getRoomNo() {
		return roomNo;
	}

}
