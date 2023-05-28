package Day10;

import org.junit.Test;

public class validatePalindrome {
	@Test
	public void example1() {
		String str = "nihin";
		boolean result = moveZeros(str);
		System.out.println(result);
	}

	private boolean moveZeros(String str) {
		char[] ch = str.toCharArray();
		int mid = ch.length / 2;
		int left = mid, right = mid;

		while (mid >= left && mid <= right) {
			if (ch[mid--] == ch[mid++]) {
				return true;
			}
		}
		return false;
	}
}
