package VidTwo;

import java.util.Arrays;

import org.junit.Test;

public class PrintZerosToEnd {
	
	@Test
	public void example1() {
		int[] arr = {3,0,2,0,34,0,1};
		moveZeros(arr);
	}
	
	@Test
	public void example2() {
		int[] arr = {0,0,0,02,0,1};
		moveZeros(arr);
	}
	
	@Test
	public void example3() {
		int[] arr = {02,03,02,02,0,2};
		moveZeros(arr);
	}


	private void moveZeros(int[] arr) {
		
		int left=0, right=0;
		
		while(right < arr.length){
			if(arr[right] != 0)
			{
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left++] = temp;
			}right++;				
		}
		System.out.println(Arrays.toString(arr));
	}

}
