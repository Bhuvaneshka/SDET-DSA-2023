package Day1;

import java.util.Arrays;

public class Prm2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 5, 6 };
		
		int valueToInsert = 3;
		
		int[] arr2 = new int[arr1.length +1];
		
		// comparison arr1[i]<valueToInsert
		// 
		//
		int i;
		for(i=0;i<arr2.length;i++)
		{
			if(arr1[i]<valueToInsert)
			{
				arr2[i]=arr1[i];
			}else
			{
				break;
			}
		}
		
		// insert the value
		arr2[i]= valueToInsert;
		
		//handle remaining array values in old array
		for (; i < arr1.length; i++) {
			arr2[i+1] = arr1[i];
		}
		//print the o/p from new array
		System.out.println(Arrays.toString(arr2));
	}

}
