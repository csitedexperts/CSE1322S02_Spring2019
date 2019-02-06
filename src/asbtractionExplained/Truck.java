package asbtractionExplained;

public class Truck extends Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The Truck::run() called");
			
	}

	@Override
	public void hasEngine() {

		System.out.println("The Truck::hasEngine() called");
		
	}

	// Optional
	@Override
	 public  void test() {
     	System.out.println("The Truck::test() called");
		}

}
