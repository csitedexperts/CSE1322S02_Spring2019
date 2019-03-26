package multithreading;

class MyThread1 extends Thread {
	
//	@Override
	public void run()  {
		System.out.println("Inside MyThread1 run() method");
		// ... ... ...
	}
}  

class MyThread2 extends Thread 
{
	
//	@Override
	public void run()  {
		System.out.println("Inside MyThread2 run() method");
		// ... ... ...
	}
}  


public class MainThread {
	public static void main(String args[]) {
		
		MyThread1 Th = new MyThread1();
		Th.start();  // Calls run() Method 
	//	Th.run();
		
		MyThread2 Th2 = new MyThread2();
		Th2.start();  // Calls run() Method 
	//	
	}
} 