package Day5_ClassRoom;

import org.junit.Test;

public class FindOnes {

	Points to Check:
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
	
//		Time complxity: Log n
//		Space Complexity:O[1]

	@Test
	public void example() {
		int[] arr1 = { 0, 0, 0, 0, 1, 1, 1, 1 };
		System.out.println(find1s(arr1));
	}

	private int find1s(int[] arr1) {
		int left=0, right = arr1.length-1, mid = 0;
		//mid = (left+right)/2;
		System.out.println(mid);
		
		while(left<right)
		{
			mid = (left+right)/2;
			if(mid==0) left = mid+1;
			else right = mid-1;
		}
		return right-left;
	}
}
