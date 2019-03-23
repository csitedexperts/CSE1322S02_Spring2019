package fileIO_Operations;
/* J15_08.java   */
/* Writing and Reading Objects in Data File  */
import java.io.*;
import java.util.*;
class Students{  
	int    Roll;
	String Name;
	double Mark;

	public Students( int R, String N, double M) {  
		Roll = R;
		Name = N;
		Mark = M;
	}
	public Students() // Empty Constructor
	{
	}
	public void WriteData(PrintWriter PR) throws IOException
	{  
		PR.println(Roll + "|" + Name + "|" + Mark); // | as delimiter
	}
	public void ReadData(BufferedReader in) throws IOException
	{  
		String Str = in.readLine();
		StringTokenizer t = new StringTokenizer(Str, "|");
		Roll = Integer.parseInt(t.nextToken());
		Name = t.nextToken();
		Mark = Double.parseDouble(t.nextToken());
	}
	public void display()
	{  
		System.out.println( Roll + "  " + Name + "  " + Mark); 
		// Blank Space ("  ") as delimiter
	}
}
public class J15_08{  
	static void WriteData(Students[] S, PrintWriter PR) 
			throws IOException
	{  
		PR.println(S.length);
		int i;
		for (i = 0; i < S.length; i++)
		{   
			S[i].WriteData(PR);
		}
	}
	static Students[] ReadData(BufferedReader BR) throws IOException
	{  
		int n = Integer.parseInt(BR.readLine());
		Students S[] = new Students[n];
		int i;
		for (i = 0; i < n; i++)
		{  
			S[i] = new Students();
			S[i].ReadData(BR);
		}
		return S;
	}
	public static void main(String[] args)
	{  
		Students Std[] = new Students[4];
		Std[0] = new Students(101, "Mira   ", 70.5);
		Std[1] = new Students(102, "Masud  ", 75.5);
		Std[2] = new Students(103, "Monira ", 85.5);
		Std[3] = new Students(104, "Monirul", 80.5);
		int i;
		try{  
			PrintWriter PR = new PrintWriter(new 
					FileWriter("./Students.txt"));
			WriteData(Std, PR);
			PR.close();
		}
		catch(IOException e)
		{  
			System.out.print("Error: " + e);
			System.exit(1);
		}
		try{  
			BufferedReader BR = new BufferedReader(new 
					FileReader("./Students.txt"));   
			Students S[] = ReadData(BR);
			System.out.println( "Roll  Name   Mark");
			System.out.println( "~~~~  ~~~~   ~~~~");
			for (i = 0; i < S.length; i++) 
			{
				S[i].display();
			}
			BR.close();
		}
		catch(IOException e)
		{  
			System.out.print("Error: " + e);
			System.exit(1);
		}
	}
}
