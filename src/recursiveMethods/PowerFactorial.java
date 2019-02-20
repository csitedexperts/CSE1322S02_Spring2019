package recursiveMethods;
/*Example of Recursive Method */

public class PowerFactorial {
	public static void main(String args[]) {
		int x=5, y = 3; 
		System.out.print("The "+ x +" to the power " + y + " is : "+ power(x, y));
	}  

	static int power(int x, int y) {
		if (y==1)
			return x;
		else{
			return x * power(x, y-1);  // recursion makes here
		}
	}
}  

