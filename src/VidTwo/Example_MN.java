package VidTwo;

import org.junit.Test;

public class Example_MN {
	@Test
	public void example2()
	{
		int[] arr1 = {5,8,6,2,17,3};
		int[] arr2 = {3,6,2,5,7,8};
		FindArrayIntersection(arr1,arr2);	
	}

	private void FindArrayIntersection(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
