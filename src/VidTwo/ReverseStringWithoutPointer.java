package VidTwo;

import org.junit.Test;

public class ReverseStringWithoutPointer {

	@Test
	public void reverseString() {
		String s = "hello";
		reverseStringWithoutPointer(s);
	}

	private void reverseStringWithoutPointer(String s) {
		char ch[] = s.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			System.out.println(ch[i]);		
		}
	}
}
