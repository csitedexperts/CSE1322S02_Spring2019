package multithreading;
/*   J18_10.java   */
/*  Using sleep() Method with try and catch Statements */
class A1810 extends Thread   // Thread A1810
{
public void run() {
 for(int  k= 1; k<=5; k=k+2)
   {
    System.out.println("Inside Thread A1810 : k = " +k);
    try{
      sleep(1000);  // Causes wait of 1 Sec.
       }
    catch(Exception E){
 System.out.println("Eception Caught.");
      }
    }
  System.out.println("Exit From A1810.");
  }
}  

 public class J18_10{   // Main Thread
 public static void main(String args[]){
   System.out.println("Starting Main Thread:");
   A1810 Th1 = new A1810(); //Creating Object of Thread A1810
   System.out.println("Starting Thread A1810:");
   Th1.start();  // Calls run() Method of Thread A1810 
   System.out.println("Exit From Main Thread.");
  }
}  
