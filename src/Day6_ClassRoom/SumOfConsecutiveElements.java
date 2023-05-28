package Day6_ClassRoom;

import org.junit.Test;

public class SumOfConsecutiveElements {

	@Test
	public void example() {
		int[] arr1 = { 1, 5, 2, 3, 7, 1 };
		int k = 3;
		executeSum(arr1,k);
	}

	private void executeSum(int[] arr1, int k) {
		int sum=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length-k; j++) {
				sum = arr1[j]+arr1[j+1]+arr1[j+2];
				sum = sum+arr1[j+2]-arr1[0];
			}
		}
		System.out.println(sum);
	}
}
