package fileIO_Operations;
/* J15_04.java   */
/* Writing into a Data File  */
import java.io.*;
  public class J15_04
{  
 public static void main(String[] args) throws IOException
   {  
   FileWriter fws = new FileWriter("./test.txt");
   System.out.println("A file named test.txt is opened for you: ");
   System.out.println("Write something and Press ENTER to Save:");
   FileOutputStream fos = new FileOutputStream("./test.txt");
   char c = (char)System.in.read();  // Reading  a Character
   while(c != '\n')   // While not pressed ENTER
    {
    fos.write(c);  // Writting into file
    c = (char)System.in.read();// Reading  a Character
    }
   fws.close();
  }
}
