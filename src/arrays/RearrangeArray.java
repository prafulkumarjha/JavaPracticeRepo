package arrays;

/**
 * @author pjha
 * 
 * Given an array of size n where all elements are in range from 0 to n-1,
 * change contents of arr[] so that arr[i] = j is changed to arr[j] = i.
 *
 */


public class RearrangeArray {

	public static void main(String args[])
	{
		 int arr[] = {1, 3, 0, 2};
		    int n = arr.length;
		 
		    System.out.println("Given array is \n");
		    printArray(arr, n);
		 
		    rearrangeNaive(arr,  n);
		 
		    System.out.println("Modified array is \n");
		    printArray(arr, n);
	}

	private static void rearrangeNaive(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int[] temp = {};
		for(int i=0; i<n;i++)
		{
			temp[arr[i]]=i;
		}
		
		
	}

	private static void printArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		
	}
	
}
