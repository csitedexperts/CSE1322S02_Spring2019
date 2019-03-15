package exceptionHandling;
/* J14_11.java */
/*  Using throws Statement  */
import  java.io.*; 
public class J14_11 {
	static int setInt()  throws IOException 
	{
		/*C# does not have this keyword or an equivalent one, as in C#, 
		 * if you don't handle an exception, it will bubble up, 
		 * until caught or if not caught it will terminate the program.
		
		* See more at: https://stackoverflow.com/questions/3465465/how-to-use-java-style-throws-keyword-in-c
		* 
		*/
	
		BufferedReader BR = 
				new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		String S = null;
		
			S = BR.readLine();
		
		return Integer.parseInt(S);
	}

	public static void main(String args[]) {
		int x=0, y=0, d=0;
		try {
			x = setInt();
			y = setInt();
			d = x/y;
		}
		catch(Throwable E) {
			System.out.println("[" + E +"]");
		}
		System.out.println(x +"/" +y + " = " +d);
	}
}
