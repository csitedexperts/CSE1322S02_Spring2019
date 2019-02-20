package recursiveMethods;
/*Example of Recursive Method */

public class RecursiveStringReverse {
	public static void main(String args[]) {
		String hello = "Hello"; 
		System.out.print("Reverse of the string '"+ hello +"' is : "+ reverse(hello));
	}  

	static String reverse(String str) {
		if (str == null  || str.length() <=1)
			
			return str;
		else{
			return (reverse(str.substring(1)) +  str.charAt(0));  // recursion makes here
		}
	}
}  

