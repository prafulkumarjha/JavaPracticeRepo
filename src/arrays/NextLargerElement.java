package arrays;

/*
 * Given an array A [ ] having distinct elements,
 * the task is to find the next greater element for each element of the array in order of their appearance in the array. 
 *  If no such element exists, output -1 
 */

public class NextLargerElement {


	
	public static void main(String args[]){
		int arr [] = {11, 13, 21, 3}; 
		
		printNextLargerElement(arr);
	}

	private static void printNextLargerElement(int[] arr) {
		int i = 0;
		int j =0;
		// TODO Auto-generated method stub
		boolean flag = false;
		for( i=0; i<arr.length; i++) {
			flag = false;
			for(  j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i])
					System.out.print(arr[j]+" ");
				break;
			}
			if(j==arr.length)
				System.out.print("-1");
		}
		if(i==arr.length)
			System.out.print("-1");
		
	}
	
	
}
