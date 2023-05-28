package Practices;

import org.junit.Test;

public class RightPascalTriangle {
//
//	1. Right Pascal’s Triangle
//	Enter the number of rows: 5
//
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	*

//	Points to Check:
//	1)	Did you understand the problem? - Yes
//	2)	Test data Set - Yes
//	3)	Do I know how to solve it? - Yes
//	4)	Ask for Hint? - Yes
//	5)	Do I know alternate solution as well? - No
//	6)	Find out the Big O Notation? -  Yes
//	7)	Start always with pseudo code - Yes
//	8)	Implement the code in Editor, - Yes
//	9)	Test different set of data - Yes
//	10)	If it fails, debug them to solve it!! - Yes

//	Time Complexity : O[n]
//	space Complexity :O[1]

//	Pseudo code:
//	1) intialize variable n = store the given value 5 --  no need
//			2) create a for loop to traverse from 0 to n
//			3) Create for loop and print the star for n time
//			4) create one more for loop to reverse to print the star 
//			5) Give an single line to print in the next line
	@Test
	public void example() {
		int n = 5;
		drawRightPascalTriangle(n);
	}

	private void drawRightPascalTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int star = 0; star < i + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int r = n-1;
		for (int j = r; j > 0; j--) {
			for (int reverseStar = r - 1; reverseStar > 0; reverseStar--) {
				System.out.print("*");
			}
			System.out.println();
			r--;
		}
//			System.out.println();
	}

}
