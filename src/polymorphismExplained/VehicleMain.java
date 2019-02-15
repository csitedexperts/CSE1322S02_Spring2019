package polymorphismExplained;

public class VehicleMain {

	public  void  Test() {
		System.out.println("Test()  called");

		// Vehicle.run();

	}

	public static void main(String[] args) {
		//Vehicle v10 = new Vehicle();

		Vehicle v1 = new Car(); // Are all cars Vehicle?  Yes
		//Car v2 = new Vehicle(); // Are all  Vehicles cars ?  No
		//Car v3 = new Truck() ; // // Are all  Trucks cars ? No

		Vehicle v12 = new Vehicle(); // Are all Vehicles Vehicle?
		Car v13 = new Car();  // Are all cars Car?		
		Vehicle v11 = new Car(); // Are all cars Vehicle?

		v12.run();  // The Vehicle::run() called..
		v11.run();;;;;  // The Car::run() called..
		//v11.r
	}

	// Why and how to override the toString() method?

}
