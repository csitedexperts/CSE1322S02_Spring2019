package multithreading;
/*   J18_18.java   */
/*  Using Synchronized Method */

class Global   // Global Class
 {
 synchronized void CallMe(String Msg) // Synchronized Method
  {
   System.out.print("[" +Msg);

 try{
   Thread.sleep(1000);
    }
 catch(Exception E)
   {
    System.out.print("Exception Caught.");
   }

 System.out.println("]");
 }
}

class Caller implements Runnable   // Caller Thread 
{
 String Msg;
 Global  Target;
 Thread Th;
 
public Caller(Global Gb, String S)
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
   Global Obj = new Global();
   Caller1814 Obj1 = new Caller1814(Obj, "Hello");
   Caller1814 Obj2 = new Caller1814(Obj, "Java");
   Caller1814 Obj3 = new Caller1814(Obj, "Programmer");
   try{
      Obj1.Th.join();
      Obj2.Th.join();
      Obj2.Th.join();
     }
   catch(Exception E)
     {
     System.out.println("Exception Caught.");   
     } 
  }
}  
