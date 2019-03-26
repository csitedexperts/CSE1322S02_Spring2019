package multithreading;
/*   J18_11.java   */
/*  Using yield(), stop() and sleep() Methods with try and catch Statements */
class A1811 extends Thread   // Thread A1811
{
public void run(){
 for(int  i= 1; i<=5; i=i+2)
   {
    System.out.println("Inside Thread A1811 : i = " +i);
    if(i==3) 
     yield();
   }
  System.out.println("Exit From A1811.");
  }
}  
class B1811 extends Thread   // Thread B1811
{
public void run()
 {
  for(int  j= 2; j<=6; j=j+2)
   {
    System.out.println("Inside Thread B : j = " +j);                 
    if(j==4) 
     stop();
   }
  System.out.println("Exit From B.");
 }
}  
class C1811 extends Thread   // Thread C1811
{
public void run()
 {
 for(int  k= 1; k<=5; k=k+2)
   {
    System.out.println("Inside Thread C1811 : k = " +k);
    try{
      sleep(1000);  // Causes wait of 1 Sec.
       }
    catch(Exception E)
      {
System.out.println("Eception Caught.");
      }
    }
  System.out.println("Exit From C1811.");
  }
}  

 public class J18_11   // Main Thread
{
 public static void main(String args[])
  {
	 A1811 Th1 = new A1811(); //Creating Object of Thread A1811
	 B1811 Th2 = new B1811(); //Creating Object of Thread B1811
   C1811 Th3 = new C1811(); //Creating Object of Thread C1811

   System.out.println("Starting Thread A1811:");
   Th1.start();  // Calls run() Method of Thread A1811 

   System.out.println("Starting Thread B1811:");
   Th2.start();  // Calls run() Method of Thread B1811 

   System.out.println("Starting Thread C1811:");
   Th3.start();  // Calls run() Method of Thread C1811 

   System.out.println("Exit From Main Thread.");
  }
}  
