package Day10;

import org.junit.Test;

public class RevereseString {

//	IP: Welcome
//	OP: emoclew

	@Test
	public void example() {
		String s = "Welcome";
		reverseString(s);
	}

	private void reverseString(String s) {
		char ch[] = s.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);		
		}	
	}
}
