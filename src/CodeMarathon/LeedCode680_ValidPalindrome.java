package CodeMarathon;

import org.junit.Test;

public class LeedCode680_ValidPalindrome {
//	Given a string s, return true if the s can be palindrome after deleting at most one character from it.

//	Example IP: "abca"
//			OP: True

	// Points to Check:
	// 1) Did you understand the problem? - Yes
	// 2) Test data Set - Yes
	// 3) Do I know how to solve it? - Yes
	// 4) Ask for Hint? - No
	// 5) Do I know alternate solution as well? - No
	// 6) Find out the Big O Notation? - Yes
	// 7) Start always with pseudo code - Yes
	// 8) Implement the code in Editor, - Yes
	// 9) Test different set of data - Yes
	// 10) If it fails, debug them to solve it!! - Yes
//	
//	Time Complex: O(n)
//	Space Complex: O(1)

//Pseudo Code:
//1) Create Left=0 and Right = size variables,
//2) Traverse from left to right using loops
//3) check if condition charAt values from both left and right are qual,if ture increment both
//4) Else check the next incremented values are palindrome or not, if yes return true else false

	@Test
	public void example1() {
		String s = "aba";
		System.out.println(validatePalindrome(s));
	}
	
	@Test
	public void example2() {
		String s = "abca";
		System.out.println(validatePalindrome(s));
	}
	
	@Test
	public void example3() {
		String s = "abc";
		System.out.println(validatePalindrome(s));
	}

	@Test
	public void example4() {
		String s = "a";
		System.out.println(validatePalindrome(s));
	}
	
	private boolean validatePalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				return validatePalindrome(s, left + 1, right) || validatePalindrome(s, left, right - 1);
			}
		}
		return true;
	}

	private boolean validatePalindrome(String s, int left, int right) {
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			} else {
				left++;
				right--;
			}
		}
		return true;
	}
}
