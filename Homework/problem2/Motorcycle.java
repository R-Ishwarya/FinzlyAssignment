package problem2;

public class Motorcycle implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("Motorcycle get started");
		
	}

	public void accelerate() {
		System.out.println("Motorcycle is acclerated");
		
	}

	public void brake() {
		System.out.println("Motorcycle holds with a brake");
		
	}
	

}
