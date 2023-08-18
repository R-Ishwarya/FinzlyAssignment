package Libraryitem;
public class Studentmember extends Librarymember {
	public Studentmember(int memberId, String name) {
		super(memberId, name);
	}
	void borrowitem(Libraryitem i) {
		System.out.println("The member name "+ super.getName());
		System.out.println("The member id "+ super. getMemberId());
	}	
}
