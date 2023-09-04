package Hotelmanagement2;

public class HouseKeeping extends Employee{

	public HouseKeeping(int employeeID, String employeeName, double salary) {
		super(employeeID, employeeName, salary);
	}

	@Override
	public void performDuties() {
		System.out.println(super.getEmployeeName()+ "perform house keeping duties.");
	}

}
