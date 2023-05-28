package Day6_ClassRoom;

public class DynamicSlidingWindow {

	public static void main(String[] args) {
		int[] arr1 = { 1, 7, 4, 3, 1, 2, 1, 5, 1 };
		int desiredSum = 7;
		executeSum(arr1,desiredSum);
	}

	private static void executeSum(int[] arr1, int desiredSum) {
		int maxSum=0, sum = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			maxSum += arr1[i];
			
			if(sum>maxSum) {
				maxSum = sum;
			}
			if(maxSum<desiredSum)
			{
				break;
			}
		}
		
//		int sum = maxSum;
//		for (int i = 0; i < arr1.length; i++) {
//			
//		}
		System.out.println(sum);
	}
}
