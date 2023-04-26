package Practices;

import java.util.Arrays;

import org.junit.Test;

public class prtRemoveOccurrenceFirstLast {
	@Test
	public void example() {
		int[] arr1 = { 1, 2, 3, 4, 5, 1 };
		int[] result = removeOccurrence1(arr1);
		System.out.println(Arrays.toString(result));
	}

	private int[] removeOccurrence1(int[] arr1) {
		int firstIndex = 0, lastIndex = arr1.length - 1, number = 1;
		int[] arr2 = new int[arr1.length];
		
		for (int i = 0; i <= arr1.length - 1; i++) 
		{
			if(arr1[i]==number)
			{
				arr2[i] = arr1[i+1];
			}
		}
		return arr2;
	}
}
