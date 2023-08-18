package Libraryitem;

public class Book extends Libraryitem {
	private String author;

	public Book(String title, int itemId, String author) {
		super(title, itemId);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Author of the book "+author);
	}
	

}
