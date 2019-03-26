package multithreading;

class MyThread3 implements Runnable {

	//	@Override
	public void run()  {
		System.out.println("Inside MyThread3 run() method");
		// ... ... ...
	}
}  

class MyThread4 implements Runnable
{

	//	@Override
	public void run()  {
		System.out.println("Inside MyThread4 run() method");
		// ... ... ...
	}
}  


public class MainThread2_ByImplementingRunnableInterface {
	public static void main(String args[]) {

		MyThread3 MyObj3 = new MyThread3();
		Thread Th3 = new Thread(MyObj3); 
		Th3.start();  // Calls run() Method 
		//	Th.run();

		MyThread4 MyObj4 = new MyThread4();
		Thread Th4 = new Thread(MyObj4); 
		Th4.start();  // Calls run() Method 
		//	
	}
} 