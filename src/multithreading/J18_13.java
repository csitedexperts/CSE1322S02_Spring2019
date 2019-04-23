package multithreading;
/*   J18_13.java   */
/*  Using Synchronized Method */

class Global1813   // Global Class
 {
 synchronized void CallMe(String Msg) // Synchronized Method
  {
   System.out.print("[" +Msg);

 try{
   Thread.sleep(3000);
    }
 catch(Exception E)
   {
    System.out.print("Exception Caught.");
   }

 System.out.println("]");
 }
}

class Caller1813 implements Runnable   // Caller Thread 
{
 String Msg;
 Global1813  Target;
 Thread Th;
 
public Caller1813(Global1813 Gb, String S)
 {
 Target = Gb;
 Msg = S;
 Th = new Thread(this);
 Th.start();
 }
public void run()
 {
  Target.CallMe(Msg);
 }
}  

 public class J18_13   // Main Thread
{
 public static void main(String args[])
  {
   Global1813 Obj = new Global1813();
   Caller1813 Obj1 = new Caller1813(Obj, "Hello");
   Caller1813 Obj2 = new Caller1813(Obj, "Java");
   Caller1813 Obj3 = new Caller1813(Obj, "Programmer");

   try{
      Obj1.Th.join();
      Obj2.Th.join();
      Obj3.Th.join();
      
     }
   catch(Exception E)
     {
     System.out.println("Exception Caught.");   
     } 
  }
}  
