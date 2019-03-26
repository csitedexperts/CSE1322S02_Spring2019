package multithreading;
/*   J18_12.java   */
/*  Example of a Multi-Threaded Program */
/*   In extending Thread Class  */
class A1812 extends Thread   // Thread A1812
{
public void run()
 {
 for(int  i= 1; i<=5; i=i+2)
   {
    System.out.println("Inside Thread A1812 : i = " +i);
   }
  System.out.println("Exit From A1812.");
  }
}  
class B1812 extends Thread   // Thread B1812
{
public void run()
 {
  for(int  j= 2; j<=6; j=j+2)
   {
    System.out.println("Inside Thread B1812 : j = " +j);                 
   }
  System.out.println("Exit From BA1812.");
 }
}  
class C1812 extends Thread   // Thread C1812
{
public void run()
 {
 for(int  k= 1; k<=5; k=k+2)
   {
    System.out.println("Inside Thread C1812 : k = " +k);
   }
  System.out.println("Exit From C1812.");
  }
}  
 public class J18_12{   // Main Thread
public static void main(String args[])
  {
   A1812 Th1 = new A1812(); //Creating Object of Thread A1812
   B1812 Th2 = new B1812(); //Creating Object of Thread B1812
   C1812 Th3 = new C1812(); //Creating Object of Thread C1812
   Th1.setPriority(Thread.MIN_PRIORITY);  
          // Setting Thread A with Priority 1     
   Th2.setPriority(Thread.MAX_PRIORITY);
          // Setting Thread B with Priority 15     
   Th3.setPriority(Th1.getPriority()+2);
          // Setting Thread C with Priority 3     
   System.out.println("Starting Thread A1812:");
   Th1.start();  // Calls run() Method of Thread A 

   System.out.println("Starting Thread B1812:");
   Th2.start();  // Calls run() Method of Thread B 

   System.out.println("Starting Thread C1812:");
   Th3.start();  // Calls run() Method of Thread C 
   System.out.println("Exit From Main Thread.");
  }
}  
