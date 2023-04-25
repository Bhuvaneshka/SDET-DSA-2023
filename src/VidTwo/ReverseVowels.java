package VidTwo;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class ReverseVowels {

	@Test
	public void reverseVowels() {
		String text = "abcde";
		reverseVwl(text);
	}
	
	@Test
	public void reverseVowels1() {
		String text = "aeiou";
		reverseVwl(text);
	}
	
	@Test
	public void reverseVowels2() {
		String text = "rty";
		reverseVwl(text);
	}
	
	private void reverseVwl(String text) {
		char[] ch = text.toCharArray();
		int left = 0, right = ch.length - 1;

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
		System.out.println(Arrays.toString(ch));
	}

	private boolean IsVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		return false;
	}

}
