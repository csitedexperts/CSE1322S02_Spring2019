package sortingAlgs;


/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Java  // https://www.geeksforgeeks.org/java-program-for-bubble-sort/
// https://www.javatpoint.com/bubble-sort-in-java
 */
// Java program for implementation of Bubble Sort
public class BubbleSort{
	public static void bubbleSort(int a[])	{
		int swapsNeeded = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++)
				if (a[j] < a[i])  // Makes Ascending order
				{
					// swap temp and a[i]
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					swapsNeeded++;
				}
		}
		
		System.out.println("Swaps Needed: " + swapsNeeded);
	}

	// Driver method to test above
	public static void main(String args[])
	{
		int arr[] = {8, 4, 2, 1};
		//int arr[] = {64, 34, 14, 25, 12, 22, 11, 90, 1};

		System.out.println("Unsorted array");
		/* Prints the array */
		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();


		bubbleSort(arr);
		System.out.println("Sorted array");
		/* Prints the array */

		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}