package array;

public class A1DNumberArray {

	public static void main(String[] args) {
		int number = 7;

		int count = 0; boolean flag = false;

		//		1, 2, 3, 10, 4, 5, 6, 11, 7, 8, 9, 12

		// in C#: int [] numArray = new int[] {1, 2, 3, 10, 4, 5, 6, 11, 7, 8, 9, 12};		

		//	In Java;
		int [] numArray = {-1, -2, -3, -10, -4, -5, -6, -31};		
	
		//		System.out.println(numArray.length);
		int tempMax = numArray[0];
//		int tempMax = 0;
		
		for (int i = 0; i< numArray.length; i++ ) {
			if (numArray[i] % 2 == 0)
			{
				if(numArray[i] < tempMax) {
					tempMax =numArray[i]; 
				}
				System.out.println(numArray[i]);
			}
		}
		System.out.println("The min even Number is: " + tempMax);
	}
}
