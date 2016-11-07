package arrays;

/**
 * 
 * @author pjha
 * 
 * Write an efficient C program to find the sum of contiguous subarray within a one-dimensional array of 
 * numbers which has the largest sum.
 *
 */
public class MaxSubArraySum {
	
	public static void main(String args[])
	{
		 int a[] = {-2, -3, -4, -1, -2, -1, -5, -3};
		 int max_sum1 = maxSubArraySum1(a, a.length); //Using Kadane Algorithm, can't handle all negative number in array
		 int max_sum2 = maxSubArraySum2(a, a.length);//Improvement in terms of time in Kadane algo
		 int max_sum3 = maxSubArraySum3(a, a.length); // Negative number improvement
		 System.out.println(max_sum1);
		 System.out.println(max_sum2);
		 System.out.println(max_sum3);
	}

	private static int maxSubArraySum3(int[] arr, int length) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int max_so_far = 0;
				int max_ending_here = 0;
				for(int i = 0; i<length; i++) {
					max_ending_here+=arr[i];
					if(max_ending_here < 0) {
						max_ending_here = 0;
					}
					else if(max_ending_here >max_so_far)
						max_so_far = max_ending_here;
				}
				
				
				return max_so_far;
		
	}

	private static int maxSubArraySum1(int[] arr, int length) {
		// TODO Auto-generated method stub
		int max_so_far = 0;
		int max_ending_here = 0;
		for(int i = 0; i<length; i++) {
			max_ending_here+=arr[i];
			if(max_ending_here < 0) {
				max_ending_here = 0;
			}
			if(max_ending_here >max_so_far)
				max_so_far = max_ending_here;
		}
		
		
		return max_so_far;
	}
	
	private static int maxSubArraySum2(int[] arr, int length) {
		// TODO Auto-generated method stub
		int max_so_far = arr[0];
		int max_ending_here = arr[0];
		for(int i = 1; i<length; i++) {
			max_ending_here = Math.max(arr[i],max_ending_here+arr[i]);
			max_so_far = Math.max(max_ending_here, max_so_far);
		}
		
		
		return max_so_far;
	}

	
	
}
