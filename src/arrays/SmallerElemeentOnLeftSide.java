package arrays;

import java.util.Stack;

/*
 * 
 * Find the nearest smaller numbers on left side in an array
Given an array of integers, find the nearest smaller number for every element such that the smaller element is on left side.

Examples:

Input:  arr[] = {1, 6, 4, 10, 2, 5}
Output:         {_, 1, 1,  4, 1, 2}
First element ('1') has no element on left side. For 6, 
there is only one smaller element on left side '1'. 
For 10, there are three smaller elements on left side (1,
6 and 4), nearest among the three elements is 4.

Input: arr[] = {1, 3, 0, 2, 5}
Output:        {_, 1, _, 0, 2}
 * 
 */
public class SmallerElemeentOnLeftSide {
	
	
	public static void main(String args[])
	{
		int arr[] = {1, 3, 0, 2, 5};
		printPrevSmaller(arr, arr.length);
		
	}

	private static void printPrevSmaller(int[] arr, int length) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<length;i++)
		{
			while(!stack.isEmpty() && stack.peek()>= arr[i])
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
				System.out.print("_");
			else
				System.out.print(" "+stack.peek()+" ");
			stack.push(arr[i]);
			
		}
		
	}

}
