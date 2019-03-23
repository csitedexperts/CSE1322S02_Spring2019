package fileIO_Operations;
/* 	J15_09.java	  */
/* A Sample File Management Program */
import java.io.*;
public class J15_09{
	public static void main(String args[]) throws IOException
	{
		FileWriter fr = new FileWriter("./textttt.txt");
		   
		File f = new File("./", "textttt.txt");
		if(f.exists()==true)
		{
			System.out.println("The file : "  + f.getName() +" exists.");
			System.out.println("Absoulate Path of the File is : " + f.getAbsolutePath());
			System.out.println("Path of the File is : " + f.getPath());
		}
		else{
			System.out.println("The file : "  + f.getName() +" does not exist.");
		} 
	}
}
