package VidTwo;

import java.util.Iterator;

import org.junit.Test;

public class NewApproachExample {
	
	/* Problem:
	 * YOu have to find the min value in the given array
	 */

	@Test
	public void example2()
	{
		int min = findMin(new int[] {5,2,7,9,3});
		System.out.println(min);
	}

	// Int is proimitive datatype
	private int  findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;		
	}
}
