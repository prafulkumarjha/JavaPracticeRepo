package arrays;

import java.util.HashSet;

public class FindFirstRepeatingElement {
	
	public static void main(String args[])
	{
		
		 int arr[] = {10, 5, 3, 5, 3, 5, 6};
	        printFirstRepeating(arr);
	}

	private static void printFirstRepeating(int[] arr) {
		// TODO Auto-generated method stub
		int min_repetition_index=-1;
		HashSet hashSet= new HashSet();
	for(int i=0;i<arr.length;i++)
	{
	
		if(hashSet.contains(arr[i]))
		{
		min_repetition_index=i;
		break;
		}
		else 
			hashSet.add(arr[i]);
		
	}
	
	if(min_repetition_index==-1)
		System.out.println("No Repetition Found");
	else
		System.out.println("First Element Repeted is : "+ arr[min_repetition_index]);
	}

}
