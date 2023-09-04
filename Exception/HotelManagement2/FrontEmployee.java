package Hotelmanagement2;

public class FrontEmployee extends Employee{

	public FrontEmployee(int employeeID, String employeeName, double salary) {
		super(employeeID, employeeName, salary);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void performDuties()
	{
		System.out.println(super.getEmployeeName()+ "perform front-desk duties");
	}

}
