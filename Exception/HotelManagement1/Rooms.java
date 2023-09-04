package Hotelmanagement1;

public class Rooms {
	private int roomNo;
	private boolean isAvailable;
	
	public Rooms(int roomNo) {
		this.roomNo = roomNo;
		isAvailable=true;
	}
	
	public int getRoomNo() {
		return roomNo;
	}

	public boolean isAvailable()
	{
		return isAvailable;
	}
	public void bookRoom()
	{
		isAvailable=false;
	}
	public void releaseRoom()
	{
		isAvailable=true;
	}
	
	

}
