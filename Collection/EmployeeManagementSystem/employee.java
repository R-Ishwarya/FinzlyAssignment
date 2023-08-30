package problem1;
import java.util.*;
public class employee {
  private String name;
  private int id;
  private String designation;
  private double salary;
public employee(String name, int id, String designation, double salary) {
	this.name = name;
	this.id = id;
	this.designation = designation;
	this.salary = salary;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "employee [name=" + name + ", id=" + id + ", designation=" + designation + ", salary=" + salary + "]";
}
public static void main(String[] args)
{
	ArrayList<employee> list = new ArrayList<>() ;
	Scanner sc = new Scanner(System.in);
	boolean check=true;
	while(check)
	{
		System.out.println();
System.out.println("***Employee Management System***");
System.out.println("1. Add Employee details");
System.out.println("2. View Employee Details");
System.out.println("3. Search Employee by ID");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
int n = sc.nextInt();
switch (n) {
    case 1:
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        //sc.nextLine();
        System.out.print("Enter Employee designation: ");
        String designation = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        list.add(new employee (name, id, designation,salary));
        System.out.println("Employee added successfully!");
        break;

    case 2:
    	for(employee emp: list)
		{
		  System.out.println(emp);
		}
        break;

    case 3:
        System.out.print("Enter Employee ID to search: ");
        int searchId = sc.nextInt();
        for (employee emp : list) {
			if(emp.getId() == searchId) {
				System.out.println("Employee Found");
				System.out.println(emp);
			}else {
				System.out.println("Employee not found");
			}
		}
        break;
    case 4:
        System.out.println("Exiting...");
        check=false;
        break;
    default:
        System.out.println("Invalid choice. Please enter a valid option.");
}
}
}
}
