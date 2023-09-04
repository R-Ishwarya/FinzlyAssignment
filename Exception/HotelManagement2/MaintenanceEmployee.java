package Hotelmanagement2;

public class MaintenanceEmployee extends Employee{

	public MaintenanceEmployee(int employeeID, String employeeName, double salary) {
		super(employeeID, employeeName, salary);
	}
	@Override
	public void performDuties() {
		System.out.println(super.getEmployeeName()+ "handle maintenance tasks.");
	}

}
