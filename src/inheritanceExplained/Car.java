package inheritanceExplained;

public class Car extends Vehicle // In C# Car : Vehicle
{
	int numTires;
	String gasType;
	
	// Run-time Polymorphism or Dynamic Porphism or Polymorphism
	@Override
	public  void run() {
		System.out.println("The Car::run() called..");
		
	}

	public int getNumTires() {
		return numTires;
	}

	public void setNumTires(int numTires) {
		this.numTires = numTires;
	}

	public String getGasType() {
		return gasType;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	
}
