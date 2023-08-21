package problem1;

public class Main {

	public static void main(String[] args) {
		
		Shape obj1 = new Circle(10);
		obj1.calculateArea();
		obj1.calculatePerimeter();
		Shape obj2 = new Rectangle(10,10);
		obj2.calculateArea();
		obj2.calculatePerimeter();
		Shape obj3 = new Triangle(10,10,10);
		obj3.calculateArea();
		obj3.calculatePerimeter();

	}

}
