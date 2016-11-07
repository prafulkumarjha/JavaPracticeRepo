package arrays;

/*
 * 
 * Given an array of size n-1 and given that there are numbers from 1 to n with one missing, 
 * the missing number is to be found.
 *  */

public class FindFirstMissingElement {

	public static void main(String args[]) {
		int arr[] = {1,2,5,6,3,4};
		int missingElement = findMissingElementFromArray(arr);
		System.out.println(missingElement);
	}

	private static int findMissingElementFromArray(int[] arr) {
		// TODO Auto-generated method stub
		int array_sum = 0;
		int sumTillN = (arr.length+1)*(arr.length+2)/2;
		for(int i=0; i<arr.length; i++) {
			array_sum+=arr[i];
		}
		
		return sumTillN-array_sum;
		
		//return 0;
	}
	
}
