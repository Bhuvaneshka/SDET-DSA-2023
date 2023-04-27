package Week1_Day2;

import java.util.Arrays;

import org.junit.Test;

public class InClassProgram {

//	Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).
//
//	Example: 
//
//	Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//	Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
	@Test
	public void example() {
		int[] arr1 = { 1, 2, 0, 4, 3, 0, 5, 0 };
		moveZeroToEnd(arr1);
	}

	private void moveZeroToEnd(int[] arr1) {

		int[] arr2 = new int[arr1.length];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				arr2[i] = arr1[i];
				// break;
			}else
			{
			return;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
