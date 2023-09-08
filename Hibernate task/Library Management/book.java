package POJO;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class book {
	private int ISBN;
	private String title;
	private String author;
	private int year;
	@Id
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	

}
