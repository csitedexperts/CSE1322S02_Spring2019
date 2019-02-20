package recursiveMethods;
/*Example of Recursive Method */

public class RecursiveFibonacci {
	public static void main(String args[]) {
		int n= 10; 
		System.out.println("First " + n + " Fibonacci Numbers are:\n" );
		for (int i =0; i< n; i++)
			System.out.print(fibo(i) + "   ");
							
	}  

	static int fibo(int n) {
		if (n<=1)
			return 1;
		else{
			return fibo(n-2) + fibo(n-1);  // recursion makes here
		}
	}
}  

