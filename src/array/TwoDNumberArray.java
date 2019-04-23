package array;

public class TwoDNumberArray {

	public static void main(String[] args) {
		int number = 7;

		int count = 0; boolean flag = false;

		//		1, 2, 3, 10, 4, 5, 6, 11, 7, 8, 9, 12

		/*
		1, 2, 3, 10
		4, 5, 6, 11
		7, 8, 9, 12 

		3 x 5 Matrix

		 */


		int [ ][] myArray = new int [][] 
				{
			{1, 2, 3, 10},
			{4, 5, 6, 11},
			{7, 8, 9, 12},
			{7, 8, 9, 12},
			{7, 8, 9, 12},
			{7, 8, 9, 12},
			{7, 8, 9, 12}
			
		}; 	






		System.out.println("myArray.length: " + myArray.length);


		int [][]grid= new int[][] {{5, 7, 4, 7}, {5, 7, 7, 7}, {3, 1, 3, 0}} ;

		System.out.println("grid.length: " + grid.length);

		for (int i = 0; i < grid.length; i++){
			for(int j = 0 ; j <grid[i].length; j++)
				if(grid[i][j] == number && grid[i][j] %2 == 1) {
					flag = true; 
					count= count + 1;
				}
		}
		//		if (count >=1)
		if(flag == true) /// Means if flag == true
			System.out.println("My number " + number + " is found " + count + " times");
		else
			System.out.println("My number " + number + " is NOT found");
	}
}
