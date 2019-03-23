package fileIO_Operations;
/* J15_03.java   */
/* Writing into a Data File  */
import java.io.*;
public class J15_03{  
	public static void main(String[] args) throws IOException {  
		FileWriter fws = new FileWriter("./test.txt");
		System.out.println("A file named test.txt is opened for you: ");
		System.out.println("Write something and Press ENTER to Save:");
		FileOutputStream fos = new FileOutputStream("./test.txt");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String S = br.readLine();   // Reading  a String  
		byte Buf[] = S.getBytes();
		for( int i =0; i<Buf.length; i++)   // While not ended
		{
			fos.write(Buf[i]);  // Writing into file
		} 
		fws.close();
	}
}
