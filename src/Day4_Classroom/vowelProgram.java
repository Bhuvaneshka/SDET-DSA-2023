package Day4_Classroom;

import java.util.Arrays;

import org.junit.Test;

public class vowelProgram {
	@Test
	public void reverseVowels() {
		String text = "Hello Everyone! Welcome to Testleaf";
		//o/p: "Halle evoryeno! Welcemo te TEstloef"
		//StringBuilder str = new StringBuilder(text);
		CheckAndSwapVwl(text);
	}

	private void CheckAndSwapVwl(String text) {
		char[] ch = text.toCharArray();
		int left = 0, right = text.length() - 1;

		while (left < right) {
			if (IsVowel(ch[left]) && IsVowel(ch[right])) {
				// swap
				char temp = ch[left];
				ch[left++] = ch[right];
				ch[right--] = temp;
			} else if (IsVowel(ch[left])) {
				right--;
			} else {
				left++;
			}
		}
		//System.out.println(ch.toString());
		//System.out.println(Arrays.toString(ch));
		
		String str = new String(ch);
		System.err.println(str);
	}

	private boolean IsVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' |c == 'U')
			return true;
		return false;
	}
}
