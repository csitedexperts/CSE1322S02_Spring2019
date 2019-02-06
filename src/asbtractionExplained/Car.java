package asbtractionExplained;

public class Car extends Vehicle // C# :
{

	//@Override
	public void run() {
		System.out.println("The Car::run() called");
			
	}

	//@Override
	public  void hasEngine() {
		System.out.println("The Car::hasEngine() called");
			
	}
	
	// Optional
	@Override
	 public  void test() {
     	System.out.println("The Car::test() called");
		}
     
}
