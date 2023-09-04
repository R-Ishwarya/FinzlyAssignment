package Hotelmanagement1;

public class Guest {
	private String name;
	private int age;
	private String phoneNumber;
	public Guest(String name, int age, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	@Override
	public String toString() {
		return "Guest [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

}
