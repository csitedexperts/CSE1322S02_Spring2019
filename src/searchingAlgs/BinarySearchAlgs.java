package searchingAlgs;

public class BinarySearchAlgs {

	public static void  BinarySearch1(int[] G, int target)
	{
		boolean found = false;
		int low = 0;
		int high = G.length;
		int mid = 0;
		while (!found)
		{
			mid = (low + high) / 2;
			if (target == G[mid]) {
				System.out.println("Element is found at index: " + mid);  
				return;// true;
			}
			else if (target < G[mid])
				high = mid;
			else
				low = mid;

			if (low >= high - 1) {
				System.out.println("Element is not found!");  
				return;// false;
			}
		}
		//		return ;
	}

	public static void main(String [] args) {

		int[] myData =  { -3, 2, 5, 7, 11, 15};

		System.out.println("==================================");

		//		System.out.println(

		BinarySearch1(myData, 5);

		System.out.println("==================================");

		//		System.out.println(

		binarySearch2(myData, 5);

	}

	public static void binarySearch2(int[] a,  int target){  
		int first=0; 
		int last = a.length -1;
		int mid = (first + last)/2;  
		while( first <= last ){  
			if ( a[mid] < target ){  
				first = mid + 1;     
			}else if ( a[mid] == target ){  
				System.out.println("Element is found at index: " + mid);  
				break;  
			}else{  
				last = mid - 1;  
			}  
			mid = (first + last)/2;  
		}  
		if ( first > last ){  
			System.out.println("Element is not found!");  
		}  
	}  


}
