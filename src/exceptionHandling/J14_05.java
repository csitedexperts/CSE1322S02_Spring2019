package exceptionHandling;
/*  J14_05.java   */
/*  Exception caused in division by zero  */
public class J14_05
{
	public static void main(String args[])
	{
		int x, y, z, d;
		x = 5;  y=10;  z=15;
		try {
			d = z/(y-2*x);  // Exception Makes Here (Division by zero)
			System.out.println("This line will not be executed");
			// Above line will not be executed
		}
		catch (ArithmeticException e) {
			System.out.println("Value of d is undetermined");
			System.out.println("\t(Division by zero)");  //ERROR Message
		}
		d = z/(y-x);  // OK and displayed
		System.out.println("Now d = "+d);
	}
}
