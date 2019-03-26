package multithreading;
/*   J18_05.java   */
/*   Example of Multi-Thread Program */
/*   In implementing Runnable Interface   */
class A1805 implements Runnable   // Thread A1805
{
public void run()
 {
 for(int  i= 1; i<=5; i=i+2)
   {
    System.out.println("Inside Thread A1805 : i = " +i);
   }
  System.out.println("Exit From A1805.");
  }
}  

class B1805 implements Runnable   // Thread B1805
{
public void run()
 {
  for(int  j= 2; j<=6; j=j+2)
   {
    System.out.println("Inside Thread B1805 : j = " +j);                 
   }
  System.out.println("Exit From B1805.");
 }
}  

 public class J18_05   // Main Thread
{
 public static void main(String args[])
  {
   A1805 ObjA = new A1805();  // Creating Object of Thread A1805
   Thread Th1 = new Thread(ObjA); 
   B1805 ObjB = new B1805();  // Creating Object of Thread B1805

   Thread Th2 = new Thread(ObjB); 
   
   System.out.println("Starting Thread A1805:");
   Th1.start(); //Starting Thread A1805

   System.out.println("Starting Thread B1805:");
   Th2.start();  //Starting Thread B1805
   System.out.println("Exit From Main Thread.");
  }
}  
