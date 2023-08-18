package problem1;
public class zoo {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.setName("Lion");
		a.setAge(12);
		System.out.println("Name of animal is "+ a.getName());
		System.out.println("Age of animal is "+ a.getAge());
		Animal l=new Lion();
		Animal e=new Elephant();
		Animal g = new Girafee();
		l.makesound();
		e.makesound();
		g.makesound();
		
		

	}

}
