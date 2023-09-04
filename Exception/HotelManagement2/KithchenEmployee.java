package Hotelmanagement2;

public class KithchenEmployee extends Employee{

	public KithchenEmployee(int employeeID, String employeeName, double salary) {
		super(employeeID, employeeName, salary);
	}
	@Override
	public void performDuties() {
		System.out.println(super.getEmployeeName()+ "works in kitchen.");
	}

}
