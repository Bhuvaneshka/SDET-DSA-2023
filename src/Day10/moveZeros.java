package Day10;

import java.util.Arrays;

import org.junit.Test;

public class moveZeros {

	@Test
	public void example1()
	{
		int[] nums = {0,1,0,3,12};
		moveZeros(nums);
	}

	@Test
	public void example2()
	{
		int[] nums = {0};
		moveZeros(nums);
	}
	
	@Test
	public void example3()
	{
		int[] nums = {1,0};
		moveZeros(nums);
	}
	
	
	private void moveZeros(int[] nums) {
		int pointer = 0, counter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!= 0)
			{
				nums[counter] = nums[i];
				counter++;
			}
		}
		
		int remainingSize = nums.length-counter;
		for (int i = remainingSize+1; i < nums.length; i++) {
			nums[i]=0;
		}
		System.out.println(Arrays.toString(nums));
	}
}
