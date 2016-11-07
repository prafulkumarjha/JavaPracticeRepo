package arrays;

import java.util.HashSet;

//Check if a given array contains duplicate elements within k distance from each other
public class CheckDuplicatesWithinK {

	public static void main(String args[])
	{
		 int arr[] = {10, 5, 3, 4, 3, 5, 6};
	        if (checkDuplicatesWithinK(arr, 3))
	           System.out.println("Yes");
	        else
	           System.out.println("No");
	}

	private static boolean checkDuplicatesWithinK(int[] arr, int k) {
		// TODO Auto-generated method stub
		HashSet hs =new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			if(hs.contains(arr[i]))
				return true;
			hs.add(arr[i]);
			if(i>=k)
			{
				hs.remove(arr[i-k]);
			}
		}
		return false;
	}
}
