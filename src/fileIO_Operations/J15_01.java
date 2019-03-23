package fileIO_Operations;
/* J15_01.java   */
/* Opening a New Data File  */
import java.io.*; // Required for FileWriter Class
public class J15_01{  
	
 public static void main(String[] args) throws IOException
   {  
   FileWriter fr = new FileWriter("./Mokter.txt");
   
   PrintWriter pr = new PrintWriter(fr);
   
   fr.close();
  }
}
