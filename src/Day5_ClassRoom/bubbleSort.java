package Day5_ClassRoom;

import java.util.Arrays;

import org.junit.Test;

public class bubbleSort {
	@Test
	public void example() {
		int[] arr1 = { 11, 4, 22, 18, 2, 21 };
		implementBubbleSort(arr1);
		System.out.println(implementBubbleSort(arr1));
	}

	private int[] implementBubbleSort(int[] arr1) {
		int temp = 0,left = 0, right= arr1.length-1;
		for (int i = 0; i < arr1.length-2; i++) {
			if(arr1[i]>arr1[i+1])
			{
				temp = arr1[i];
				arr1[i] = arr1[i+1];
				arr1[i] = temp;
			}
		}
		return arr1;
//		System.out.println(Arrays.toString(arr1));
	}
}
