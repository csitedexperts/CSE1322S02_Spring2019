package sortingAlgs;
/*
// https://www.geeksforgeeks.org/selection-sort/
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.

Following example explains the above steps:

arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
11 12 22 25 64 

 */
// Java program for implementation of Selection Sort
public class SelectionSort
{
	public static void selectionSort(int a[])
	{
		int swapsNeeded = 0;
		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < a.length; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < a.length; j++) 
				if (a[j] < a[min_idx]) 
					min_idx = j; 

			// Swap the found minimum element with the first element 
			int temp = a[min_idx]; 
			a[min_idx] = a[i]; 
			a[i] = temp; 
			swapsNeeded++;
		} 	

		System.out.println("Swaps Needed: " + swapsNeeded);
	}


	// Driver method to test above
	public static void main(String args[])
	{
		//		int arr[] = {8, 4, 2, 1};
//		int arr[] = {11, 9, 17, 5, 12};
		
		int  arr[] = {64, 25, 12, 22, 11}; 

		System.out.println("Unsorted array");
		/* Prints the array */
		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		selectionSort(arr);
		System.out.println("Sorted array");
		/* Prints the array */

		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}