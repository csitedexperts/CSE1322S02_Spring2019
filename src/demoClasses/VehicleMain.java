package demoClasses;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v; 
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		Vehicle v4 = new Vehicle();
		v1.doors = 4;
		v2.doors = 2;
		v3.doors = 3;
		v1.color = "Red";
		v2.color = "White";
		
		System.out.println("v1.door = " + v1.doors);
		System.out.println("v1.color = " + v1.color);
		System.out.println("v2.door = " + v2.doors);
		System.out.println("v2.color = " + v2.color);
		
		
		
		
	}

}
