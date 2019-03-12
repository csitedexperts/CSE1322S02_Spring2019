package exceptionHandling;
/*  J14_01.java   */
/*  Exception caused in division by zero  */

public class J14_01
{
	public static void main(String args[])
	{
		int x, y, z, d;
		x = 5; y=10; z=15;
		
		d = z/(y-2*x);  // Exception Makes Here (Division by zero)
//		d = 15/(10-10)  

		System.out.println("Hello friend....");
		System.out.println("d = "+d);
	}
}
