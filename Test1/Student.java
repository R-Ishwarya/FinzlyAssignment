package problem5;

import java.util.Scanner;

public class Student {
	private int StudentId;
	private String name;
	private static int totalstudents=100;
	
	public Student(int studentId, String name) {
		
		StudentId = studentId;
		this.name = name;
		System.out.println("The student name: "+name);
		System.out.println("The student Id: "+studentId);
		
	}
	/*public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalstudents() {
		return totalstudents;
	}

	public void setTotalstudents(int totalstudents) {
		this.totalstudents = totalstudents;
	}*/
	public void enroll()
	{
		totalstudents++;
		System.out.println("The students count enrolled sucessfully");
		System.out.println("The total students"+ +totalstudents);
		
	}
	public void drop()
	{
		totalstudents--;
		System.out.println("The students count dropeded sucessfully");
		System.out.println("The total students"+ +totalstudents);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student object = new Student(005,"Ishwarya");
		//object.setStudentId(005);
		//object.setTotalstudents(100);
		//object.setName("ishwarya");
		object.enroll();
		object.drop();
		

	}

}
