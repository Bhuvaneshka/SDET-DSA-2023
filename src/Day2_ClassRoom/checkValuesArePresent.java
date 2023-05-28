package Day2_ClassRoom;

import org.junit.Test;

public class checkValuesArePresent {

	@Test
	public void example() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// int[] arr2 = {1,2,3,4,5};
		int x1 = 2, y1 = 6;
		boolean result = findNos(arr1, x1, y1);
		System.out.println(result);
	}

	public boolean findNos(int[] arr, int x, int y) {
		boolean result = false;
		boolean result2 = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				result = true;
			}else if (arr[i] == y) 
			{
				result2 = true;
			}
		}
		boolean finalValue = true;
		if (result == true && result2 == true) {
			 finalValue = false;
		}
		return finalValue;
	}
}
