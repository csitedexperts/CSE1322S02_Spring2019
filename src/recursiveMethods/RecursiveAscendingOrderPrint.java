package recursiveMethods;

public class RecursiveAscendingOrderPrint {

	public static void main(String args[]) {
		dawark(10);
	}  
	
	static void dawark(int n) {
		if (n==0)
	{
			dawark(n-1);  // recursion makes here
			System.out.print(n + "  ");
			
		}
	}
}  

