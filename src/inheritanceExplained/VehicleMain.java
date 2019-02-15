package inheritanceExplained;

public class VehicleMain {

	public  void  Test() {
		System.out.println("Test()  called");

		// Vehicle.run();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v10 = new Vehicle();
		Vehicle v12 = new Vehicle(); // Are all Vehicles Vehicle?
		Car v13 = new Car();  // Are all cars Car?
		
		Vehicle v11 = new Car(); // Are all cars Vehicle?
		v11.run();
		v12.run();
		v13.run();
		v11.run();
		
		v12.run();
		
		v13.run();
		
		Vehicle v15 = new Bus();

		// Car V14 = new  Vehicle(); // Are all Vehicles Car? // No


	}

	// Why and how to override the toString() method?

}
