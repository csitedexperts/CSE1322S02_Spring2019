package multithreading;
/*   J18_07.java   */
/*  Using currentThread(), getName() and setName() Thread Control Methods */
 public class CurrentThread
{
 public static void main(String args[])
  {
  System.out.println("Starting Main Thread:");
  Thread Th = Thread.currentThread();
  System.out.println("Current Thread is: "+Th);

  Th.getName();
  System.out.println("Thread Name is: "+Th);

  Th.setName("MyThread");
  System.out.println("Now the Thread Name is: "+Th);
  System.out.println("Exit From Main Thread.");
  }
}  
