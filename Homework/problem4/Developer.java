package problem4;

public class Developer extends Employee {
	private String programlanguage;
	public Developer(String programlanguage) {
		this.programlanguage = programlanguage;
	}
	public void display()
	{
		super.display();
		System.out.println("The developer programming language is:"+programlanguage);
	}

}
