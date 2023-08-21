package problem4;

public class Manager extends Employee {
	private String department;
	
	public Manager(String department) {
		this.department = department;
	}
	public void display()
	{
		super.display();
		System.out.println("The Manager department:"+department);
	}

}
