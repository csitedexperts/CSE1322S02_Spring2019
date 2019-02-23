package recursiveMethods;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers(10);

	}

	static public void PrintNumbers(int n)
	{
		if (n > 0)
		{
			System.out.print(n + " ");
			PrintNumbers(n - 1);
			System.out.print(n + " ");
		}
	}


}
