package Libraryitem;
public class Main {
	public static void main(String[] args) {
		Libraryitem o1 = new Book("Book",6,"Ishwarya");
		o1.displayinfo();
		Libraryitem o2 = new Dvd("Book",6,4);
		o2.displayinfo();
		Studentmember o3 = new Studentmember(6,"Ishwarya");
		o3.borrowitem(o1);
		Facultymember o4 = new Facultymember(5,"Ambika");
		o4.borrowitem(o2);
	}

}
