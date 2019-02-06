package asbtractionExplained;

public class Bus extends Vehicle
{

	@Override
	public void run() {
		System.out.println("The Bus::run() called");
			
	}

	@Override
	public void hasEngine() {
		System.out.println("The Bus::hasEngine() called");
	
	}

	// Optional
	@Override
	 public  void test() {
     	System.out.println("The Bus::test() called");
		}

}
