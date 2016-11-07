package arrays;

import sun.security.util.Length;

/*
 * Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.
 * The rightmost element is always a leader. 
 */

public class LeaderElementsInArray {
	
	public static void main(String args[]) {
		int arr[] = {16,17,4,3,5,2};
		findLeaderElementsinArray(arr);
		
		
	}

	private static void findLeaderElementsinArray(int[] arr) {
		// TODO Auto-generated method stub
		
		System.out.print(arr[arr.length-1]+" ");
		int max_so_far = arr[arr.length-1];
		for(int i=arr.length-2; i>=0;i--) {
			if(arr[i]>max_so_far) {
				System.out.print(arr[i]+" ");
			max_so_far = arr[i];
			}
		}
	
		
		
	}

}
