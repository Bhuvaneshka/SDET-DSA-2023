package Day5_ClassRoom;

import java.util.Arrays;

import org.junit.Test;

public class sortPrm {

	@Test
	public void example() {
		int[] arr1 = { 11, 4, 17, 18, 2, 22 };
		sortArray(arr1);
	}

	private void sortArray(int[] arr1) {
		int pivot = arr1[0], nextMin = 0;
//		while (pivot < arr1.length-2)
		for(int j=0;j<arr1.length-2;j++){
			for (int i = 0; i < j; i++) 
			{
				if (pivot > arr1[i]) 
				{
					nextMin = arr1[i];
					pivot++;
				}
			}
			System.out.println(pivot);
			int temp = arr1[pivot];
			arr1[pivot] = nextMin;
			nextMin = temp;
		}
		System.out.println(Arrays.toString(arr1));
	}
}
