package VidTwo;

import org.junit.Test;

public class ArrayIntersection {

	@Test
	public void example1() {
		int[] num1 = { 4, 3, 6, 7, 9 };
		int[] num2 = { 56, 4, 8, 1 };
		Intersection(num1, num2);
	}

	private void Intersection(int[] num1, int[] num2) {
		
		int left = 0, right = 0;
		
		while (left < num1.length && right < num2.length) {
			if (num1[left] == num2[right]) {
				System.out.println(num1[left]);
				left++;
				right++;
			} else if (num1[left] < num2[right]) {
				left++;
			} else {
				right++;
			}
		}
	}
}
