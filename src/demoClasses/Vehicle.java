package demoClasses;

public class Vehicle {
	static int vehicleCount = 0;
	
	private int doors;
	private int speed;
	private String color;

	public Vehicle() {
//		System.out.println("A vehicle object is created");
		vehicleCount++;
		System.out.println("Vehicle(s) created: " + vehicleCount);	
		
	}
	
	public int getDoors() {  // Getter -> ret
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

	public static void run() {
		System.out.println("The run() called..");
	}
	
	
/*
	public static void main(String [] args) {
	
		
	}
*/	
	
}
