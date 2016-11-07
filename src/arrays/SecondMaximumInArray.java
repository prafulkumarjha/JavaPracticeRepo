package arrays;

public class SecondMaximumInArray {
	
	public int getSecondMaxfromArray(int arr[]) {
		int firstMax = arr[0];
		int secondMax = arr[1];
		
		if(arr[0] < arr[1]) {
			secondMax = arr[0] ;
			firstMax = arr[1];
			
		}
		for(int i=2; i<arr.length; i++) {
			if(arr[i] > firstMax ) {
				secondMax = firstMax;
				firstMax = arr[i];
			}
			else if(arr[i]<firstMax && arr[i]>secondMax ) {
				secondMax = arr[i];
			}
				
		}
		
		return secondMax;
	}

	public static void main(String args[]) {
		int arr[] = {7,2,1,8,3,16,14,17,67};
		SecondMaximumInArray sma = new SecondMaximumInArray();
		System.out.println(sma.getSecondMaxfromArray(arr));
		
		
	}
}
