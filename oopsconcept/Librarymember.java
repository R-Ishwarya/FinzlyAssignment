package Libraryitem;
public abstract class Librarymember {
  private int memberId;
  private String name;
  public Librarymember(int memberId, String name) {
	this.memberId = memberId;
	this.name = name;
}
public int getMemberId() {
	return memberId;
}
public void setMemberId(int memberId) {
	this.memberId = memberId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
abstract void borrowitem(Libraryitem i);
}
