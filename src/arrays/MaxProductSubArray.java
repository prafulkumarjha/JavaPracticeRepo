package arrays;

public class MaxProductSubArray {
	
	
	public  static void main(String args[])
	{
		
		int arr[] = {1, -2, -3, 0, 7, -8, -2};
	   
	  System.out.println("Maximum Sub array product is "+ maxSubarrayProduct(arr, arr.length));
	    
	}

	private static int maxSubarrayProduct(int[] arr, int length) {
		// TODO Auto-generated method stub
		int max_end_here=1;
		int max_so_far=1;
		int min_end_here=1;
		int temp=1;
		for(int i=0; i<length;i++)
		{
			
			if(arr[i]>0)
			{
				max_end_here = Integer.max(max_end_here*arr[i], arr[i]);
				min_end_here = Integer.min(min_end_here, 1);
			}
			else if(arr[i] == 0)
			{
				max_end_here =1;
				min_end_here = 1;
			}
			else
			{
				temp = max_end_here;
				max_end_here = Integer.max(min_end_here*arr[i], 1);
				min_end_here = temp*arr[i];
				
			}
			if(max_so_far<max_end_here)
				max_so_far = max_end_here;
		}
				return max_so_far;
	}

}
