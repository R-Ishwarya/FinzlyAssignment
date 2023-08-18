package Libraryitem;

public class Libraryitem {
 private String title;
 private int itemId;
 public Libraryitem(String title, int itemId) {
	this.title = title;
	this.itemId = itemId;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getItemId() {
	return itemId;
}

public void setItemId(int itemId) {
	this.itemId = itemId;
}

public void displayinfo() {
	System.out.println("Title of the book "+title);
	System.out.println("Id of the book "+itemId);
	 
 }
}
