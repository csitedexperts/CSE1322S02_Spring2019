package spring2019_TestReviews;

public abstract class Vehicle// extends Object // Inc C# object
{
	static int vehicleCount=0;
	private int doors;
	protected int speed;
	public String color;

	public void run() {
		System.out.println("The Vehicle::run() called..");
	}

	// Method Oveloading -- Static Binding - Static Polymorphism
	// Compile-time Polymorphism

	public Vehicle() {
		//	System.out.println("A Vehicle object is created...");
		vehicleCount++;
//		System.out.println("Vehicle(s) created: " + vehicleCount);	
	}

	public Vehicle(int doors, int speed, String color) {
		this.doors = doors; this.speed = speed; this.color = color;

	}

	public Vehicle(int doors, int speed) {
		this.doors = doors; this.speed = speed; 

	}

	public Vehicle(int doors) {
		this.doors = doors;  

	}

	public int getDoors() { // Getter =>Get  ret
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
