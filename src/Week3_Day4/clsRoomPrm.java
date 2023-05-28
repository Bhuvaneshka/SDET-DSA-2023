package Week3_Day4;

import java.util.Arrays;

import org.junit.Test;

public class clsRoomPrm {
//	Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
//	If the character ch does not exist in word, do nothing.
//	For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). 
//	The resulting string will be "dcbaefd".
//	Return the resulting string.

	// Points to Check:
	// 1) Did you understand the problem? - Yes
	// 2) Test data Set - Yes
	// 3) Do I know how to solve it? - Yes
	// 4) Ask for Hint? - No
	// 5) Do I know alternate solution as well? - Yes
	// 6) Find out the Big O Notation? - Yes
	// 7) Start always with pseudo code - Yes
	// 8) Implement the code in Editor, - Yes
	// 9) Test different set of data - Yes
	// 10) If it fails, debug them to solve it!! - Yes

	// Time Complexity:O(n)
	// space Complexity:O(1)

	@Test
	public void example() {
		String word = "abcdefd";
		char ch = 'd';
		ReversePrefixOfWord(word, ch);
	}

	private void ReversePrefixOfWord(String word, char ch) {
		char[] chArray = word.toCharArray();
		int rightIndexValue = 0, left = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'd') {
				rightIndexValue = i;
				break;
			}
		}
		while (left < rightIndexValue) {
			char temp = chArray[rightIndexValue];
			chArray[rightIndexValue] = chArray[left];
			chArray[left] = temp;
		}
		System.out.println(Arrays.toString(chArray));
	}
}
