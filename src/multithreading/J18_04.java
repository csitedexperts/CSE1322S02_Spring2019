package multithreading;
/*   J18_04.java   */
/*  Calling Another Method inside run() Method */

class A1804 extends Thread   // Thread A1804
{
 void display() {
 for(int  i= 1; i<=5; i++)
   {
    System.out.println("Inside Thread A1804 : i = " +i);
    }
 }

public void run() {
  display();
  System.out.println("Exit From A1804.");
  }
}  

 public class J18_04   // Main Thread
{
 public static void main(String args[])
  {
	 A1804 Th1 = new A1804(); //Creating Object of Thread A1804
   System.out.println("Starting Thread A1804:");

   Th1.start();  // Calls run() Method of Thread A1804 
   System.out.println("Exit From Main Thread.");
  }
}  
