package Practices;

import org.junit.Test;

public class classRoomPrm {

//	Points to Check:
//		1)	Did you understand the problem? - Yes
//		2)	Test data Set - Yes
//		3)	Do I know how to solve it? - Yes
//		4)	Ask for Hint? - Yes
//		5)	Do I know alternate solution as well? - No
//		6)	Find out the Big O Notation? -  Yes
//		7)	Start always with pseudo code - 
//		8)	Implement the code in Editor, - 
//		9)	Test different set of data - 
//		10)	If it fails, debug them to solve it!! - 
//	Pseudo Code:
//		1) Find find the number of lines to print the character using while loop with condition char<'F' and store the counter value in variable n
//		2) Create a loop to traverse from 0 to n value with condition i<n
//		3) create for loop to print number of space values with condition i<=n-1
//		4) create another for loop paralelly to print the char with condition j+1 && J-1

//	Time complexity = O[4n] = O[n]
//	Space complecity = O[1]

	@Test
	public void example() {
		char ch = 'F';
		drawCharEmptyDiamond(ch);
	}

	private void drawCharEmptyDiamond(char ch) {

		// Find the length
		int counter = 0;
		while (0 < ch) {
			counter++;
		}
		System.out.println(counter);
		
		//To loop from 0 to n
		for (int i = 0; i < counter; i++) {
			for (int j =0 ; j<=ch-counter; j++) {
				System.out.println(ch);
			}
		}
	}
}
