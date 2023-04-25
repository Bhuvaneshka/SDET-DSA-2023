package VidTwo;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {

	@Test
	public void example() {
		int[] num1 = { 1, 2, 3 };
		int[] num2 = { 2, 3, 5 };
		mergeArray(num1, num2);
	}

	private void mergeArray(int[] num1, int[] num2) {
		int left = 0, right = 0, index = 0;
		int m = num1.length, n = num2.length;
		int[] output = new int[m + n];
		while (left < m || right < n) {
			if (left == m)
				output[index++] = num2[right++];
			else if (right == n)
				output[index++] = num1[left++];
			else if (num1[left] <= num2[right])
				output[index++] = num1[left++];
			else
				output[index++] = num2[right++];
		}
		System.out.println(Arrays.toString(output));
	}
}
