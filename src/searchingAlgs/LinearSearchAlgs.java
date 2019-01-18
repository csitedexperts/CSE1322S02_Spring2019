package searchingAlgs;

public class LinearSearchAlgs {

	private static void FindANumber(int[] intArray, int target) { 
	
		int count = 0; boolean flag = false;
		for (int i = 0; i < intArray.length; i++){
			if(intArray[i] == target) {
				flag = true; count= count + 1;
			}
		}
		//		if (count >=1)
		if(flag ) /// Means if flag == true
			System.out.println("My number " + target + " is found " + count + " times");
		else
			System.out.println("My number " + target + " is NOT found");

	}


	public static void main(String [] args) {

		int[] myData =  { 20, 7, 5, -3, 11, 5};

		FindANumber(myData, 15);
		System.out.println("==================================");

		FindMaxNumber(myData);

		System.out.println("==================================");

		FindMinNumber(myData);

	}


	private static int FindMaxNumber(int[] intArray) { 
		int max = intArray[0]; 
		for (int i = 1; i < intArray.length; i++){
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}

		System.out.println("The max number is : " + max );

		return max;
	}

	private static int FindMinNumber(int[] intArray) { 
		int min = intArray[0]; 
		for (int i = 1; i < intArray.length; i++){
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}

		System.out.println("The min number is : " + min );

		return min;
	}

}
