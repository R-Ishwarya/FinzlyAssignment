package problem1;

public class Rectangle implements Shape {
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		double area=width*height;
		System.out.println("The area of rectangle:"+ area);
		
		
	}

	@Override
	public void calculatePerimeter() {
		double perimeter=2*(height+width);
		System.out.println("The perimeter of rectangle:"+ perimeter);
		
	}
}
