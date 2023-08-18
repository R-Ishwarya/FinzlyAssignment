package Libraryitem;
public class Dvd extends Libraryitem {
	private int duration;
	public Dvd(String title, int itemId, int duration) {
		super(title, itemId);
		this.duration = duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("The duration of the DVD "+duration);
	}
	
	

}
