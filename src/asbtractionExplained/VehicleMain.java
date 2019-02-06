package asbtractionExplained;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v; 

		Vehicle v1 = new Bus();
		Vehicle v2 = new Car();
		Vehicle v3 = new Truck();

		Vehicle v4 = new Car();

		Car v5 = new Car();

		// Car v6 = new Vehicle();
		// Car v7 = new Bus();


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
