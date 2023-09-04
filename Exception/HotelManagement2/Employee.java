package Hotelmanagement2;

public class Employee {
	private int employeeID;
	private String employeeName;
	private double salary;
	public Employee(int employeeID, String employeeName, double salary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	public void performDuties()
	{
		System.out.println(employeeName+ "perform general duties");
	}

}
}
