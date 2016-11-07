package arrays;

public class SegragateZeroAndOne {

	
	public static void main(String arg[])
	{
		int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		segregate0and1(arr, arr.length);
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}

	private static void segregate0and1(int[] arr, int length) {
		// TODO Auto-generated method stub
		int left=0;
		int right=length-1;
		while(left<right)
		{
			while(arr[left]==0 && left < right)
				left++;
			while(arr[right] == 1 && right > left)
				right--;
			
			/* If left is smaller than right then there is a 1 at left
		      and a 0 at right.  Exchange arr[left] and arr[right]*/
		     if(left < right)
		     {
		       arr[left] = 0;
		       arr[right] = 1;
		       left++;
		       right--;
		     }
		}
		
	}
	
}
