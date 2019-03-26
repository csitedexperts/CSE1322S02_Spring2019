package multithreading;
/*   J18_09.java   */
/*  Using stop() and yield() Thread Control Methods */
class A1809 extends Thread   // Thread A1809
{
public void run()
 {
 for(int  i= 1; i<=5; i++)
   {
    System.out.println("Inside Thread A1809 : i = " +i);
    if(i%2==0) 
     yield();
   }
  System.out.println("Exit From A1809.");
  }
}  
class B1809 extends Thread   // Thread B1809
{
public void run()
 {
  for(int  j= 2; j<=6; j=j+2)
   {
    System.out.println("Inside Thread B1809 : j = " +j);                 
    if(j==4) 
     stop();
   }
  System.out.println("Exit From B1809.");
 }
}  
 public class J18_09   // Main Thread
{
 public static void main(String args[])
  {
   A1809 Th1 = new A1809(); //Creating Object of Thread A1809
   B1809 Th2 = new B1809(); //Creating Object of Thread B1809
   System.out.println("Starting Thread A1809:");
   Th1.start();  // Calls run() Method of Thread A1809 
   System.out.println("Starting Thread B1809:");
   Th2.start();  // Calls run() Method of Thread B1809 
   System.out.println("Exit From Main Thread.");
  }
}
