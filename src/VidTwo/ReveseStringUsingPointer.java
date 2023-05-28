package VidTwo;

import org.junit.Test;

public class ReveseStringUsingPointer {

	@Test
	public void example4() {
		String s = "welcome";
		reverseStringUsingPointer(s);
	}

	private void reverseStringUsingPointer(String s) {
		char[] ch = s.toCharArray();
		int left = 0, right = ch.length - 1;

		while (left < right) {
			// Swap
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}
		// System.out.println(new String(ch));
	}

}
