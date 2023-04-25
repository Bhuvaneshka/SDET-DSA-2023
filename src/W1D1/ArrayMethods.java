package W1D1;

import java.util.Arrays;

import org.junit.Test;

public class ArrayMethods {
	
	@Test
	public void example() {
		int[] arr1 = {1,7,4};
		int indexValue = 1;
		int valueToInsert = 3;
		addValue(arr1,indexValue,valueToInsert);
	}
	
	private void addValue(int[] arr1, int indexValue, int valueToInsert) {
		//create  a new array
		int[] arr2 = new int[arr1.length+1];
		//for (int i = 0; i < arr1.length; i++) {
			if(arr1[indexValue]<=arr1.length)
			{
				arr2[indexValue] = valueToInsert;
				System.out.println(Arrays.toString(arr2));
			}
			
			//print the remaining values
		}
		
	}

//}
