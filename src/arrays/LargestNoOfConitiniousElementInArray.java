package arrays;

public class LargestNoOfConitiniousElementInArray {
	

	public static void  main(String args[]) {
		
		int arr[]={1, 2, 4, 100, 110, 90, 105, 70, 3};
		int length=noOfContiniousElementsInArray(arr,arr.length);
		System.out.println("Max length of array : "+length);
		
	}

	private static int noOfContiniousElementsInArray(int[] arr, int n) {
		// TODO Auto-generated method stub
	int max_len=0;
	for(int i=0;i<n;i++)
	{
		int min=arr[i];
		int max=arr[i];
		for(int j=i+1;j<n;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
			else if(arr[j]<min)
			{
				min=arr[j];
			}
				
			if((j-i)==max-min)
			{
				if(max_len<(j-i+1))
					max_len=j-i+1;
				
			}
		}	
		
	}
		
		return max_len;
	}
	
}
