package Day6_ClassRoom;

import java.util.HashMap;

public class SlidingWindowWithHashing {

	public static void main(String[] args) {
		int[] arr1 = { 10,15,-5,15,-10,0};
		int desiredSum = 5;
		executeSum(arr1,desiredSum);
	}

	private static void executeSum(int[] arr1, int desiredSum) {
		HashMap<Integer, Integer> hm = new HashMap<>();
	    int sum = 0;
	    for(int i = 0; i < arr1.length; i++){
	        sum+=arr1[i];
	        if(hm.containsKey(sum-desiredSum)){
	            System.out.println(hm.get(sum-desiredSum));
	            
	        }
	    } 
	}
}


//1) here DS = 7
//2) Sum = add of(0ton)
//3) 