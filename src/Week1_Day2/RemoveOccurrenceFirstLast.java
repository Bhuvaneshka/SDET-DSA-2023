package Week1_Day2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveOccurrenceFirstLast {

//	3. Remove the first and last occurrence of a given number in the input array
//	input = {1,2,3,4,5,1}, number = 1
//	output = {2,3,5}

//Psedocode:
//1) As per the array values, the first and last index values are holding Number 1, 
//since take first index  & last index . [int firstIndex & lastIndex]
//
//2) The expected output array size is different,so we need to create a new array with
//required array length.
//
//3) store the 1 in number variable.
//
//4) Loop the array and ignore array index 0 and arr.Length-1;
//
//5) store the remaining values in new array

	@Test
	public void example() {
		int[] arr1 = { 1, 2, 3, 4, 5, 1 };
		int[] result = removeOccurrence(arr1);
		System.out.println(Arrays.toString(result));
	}

	private int[] removeOccurrence(int[] arr1) {
		int firstIndex = 0, lastIndex = arr1.length - 1, number = 1;

		// create new array with required length which is arr1.Length+1
		int[] arr2 = new int[arr1.length - 2];

		//loop the array
		if (arr1[firstIndex] == number && arr1[lastIndex] == number) {
			
			for (int i = 1; i < arr1.length - 1; i++) {
				
					arr2[i] = arr1[firstIndex + i];
					
				
				System.out.println(arr1[i]);
				
			}
		}return arr2;
		//else return arr1;
		
		// for (int i : arr2) {
		// System.out.println(Arrays.toString(arr2));
		// }

	}
}
