package multithreading;
/*   J18_08.java   */
/*  Using yield() Thread Control Method */

class A1808 extends Thread   // Thread A1808
{
public void run()
 {
 for(int  i= 1; i<=5; i++)
   {
    System.out.println("Inside Thread A1808 : i = " +i);
     yield();
   }
  System.out.println("Exit From A1808.");
  }
}  
class B1808 extends Thread   // Thread B1808
{
public void run()
 {
  for(int  j= 1; j<=5; j++)
   {
    System.out.println("Inside Thread B1808 : j = " +j);                 
    yield();
   }
  System.out.println("Exit From B.");
 }
}  
 public class J18_08   // Main Thread
{
 public static void main(String args[])
  {
   A1808 Th1 = new A1808(); //Creating Object of Thread A1808
   B1808 Th2 = new B1808(); //Creating Object of Thread B1808
   System.out.println("Starting Thread A1808:");
   Th1.start();  // Calls run() Method of Thread A1808 
   System.out.println("Starting Thread B1808:");
   Th2.start();  // Calls run() Method of Thread B1808 
   System.out.println("Exit From Main Thread.");
  }
}  
