package problem1;

public class Triangle implements Shape {
	private int base;
	private int height;
	private int side;
	public Triangle(int base, int height,int side) {
		this.base = base;
		this.height = height;
		this.side =side;
	}

	@Override
	public void calculateArea() {
		double area=0.5*base*height;
		System.out.println("The area of triangle:"+ area);
		
	}

	@Override
	public void calculatePerimeter() {
		double perimeter=(2*side)+base;
		System.out.println("The perimeter of triangle:"+ perimeter);
		
		
	}

}
