package demoClasses;

public class VehicleMain {

	public  void Test() {
		System.out.println("The Test() called");
		Vehicle.run();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v; 
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		Vehicle v4 = new Vehicle();

//		VehicleMain.Test();
		
		Vehicle.run();
		
		//		v1.doors = 4;
		v1.setDoors(4);
		v2.setDoors(2); 
		v1.setColor("Red");
		v2.setColor("White"); 
		
		System.out.println("v1.door = " + v1.getDoors());
		System.out.println("v1.color = " + v1.getColor());
		
		System.out.println("v2.door = " + v2.getDoors());
		System.out.println("v2.color = " + v2.getColor());
		
		
		
	}

}
