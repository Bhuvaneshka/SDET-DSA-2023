package Day10;

public class LeetCode_2379 {

	public void example() {
		String blocks = "WBBWWBBWBW";
		System.out.println(getKConsecutive(blocks));
	}

	private int getKConsecutive(String blocks) {
		int k = 7;
		int left = 0,right = k-1;
		int counter=0;
		
		while(left<right)
		{
			if(blocks.charAt(left)=='W')
			{
				counter++;
				left++;
			}
		}
	}
}
