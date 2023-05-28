package Day4_Classroom;

import org.junit.Test;

public class ReverseString {
	
//Pseudo code:
//1) Create left =0 and right=string.length variable
//2) Covert the string to stringbuilder
//3) create a loop based on length 0 to str length
//4) swap the values
//5) if the condition which space comes, we need to pass 
	
	@Test
	public void example4() {
		String s = "welcome";
		//s = s.split(" ");
		reverseStringUsingPointer(s);
	}

	private void reverseStringUsingPointer(String s) {
		StringBuilder sb = new StringBuilder(s);
		int left = 0, right = sb.length();
		
		while(left<right)
		{
			String temp = sb.
		}
		
	}
}
