package problem3;

public class Student {
	private String name;
	private int age;
	private int studentid;
	Student()
	{
		this.name="unknown";
		this.age=0;
		this.studentid=6;
		System.out.println("The name of the student is:"+name);
		System.out.println("The age of the student is:"+age);
		System.out.println("The studentid of the student is:"+studentid);
		
	}
	public Student(String name, int age, int studentid) {
		this.name = name;
		this.age = age;
		this.studentid = studentid;
		System.out.println("The name of the student is:"+name);
		System.out.println("The age of the student is:"+age);
		System.out.println("The studentid of the student is:"+studentid);
	}
	Student(int age)
	{
		this.age=age;
		System.out.println("The age of the student is:"+age);
	}
	public static void main (String[] args)
	{
		Student obj1 = new Student();
		Student obj2 = new Student("Ishwarya",21,6);
		Student obj3 = new Student(21);
		
	}
	

}
