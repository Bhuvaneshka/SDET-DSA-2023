package Day1;

import java.util.Iterator;

import org.junit.Test;

public class Prm1 {

	// output {1,2,3,4,5}
	@Test
	public void exaample() {
		int[] arr1 = { 1, 2, 2, 3, 4, 5, 5 };
		findDistint(arr1);
	}

	private void findDistint(int[] arr1) {
		int left = 0, right = 1, size = arr1.length+1;
		while (size != 0) {
			if (arr1[left] != arr1[right]) {
				System.out.println(arr1[left]);				
			}
			left++;
			right++;
		}
	}

}
