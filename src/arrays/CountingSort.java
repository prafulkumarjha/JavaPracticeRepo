package arrays;

public class CountingSort {
	public static void countingSort(int arr[],int len)
	{
		int max=1024;
		int count[]=new int[max];
		for(int i=0;i<len;i++)
			count[arr[i]]++;
		for(int i=0;i<len;i++)
			System.out.print(count[i]+" ");
		for(int i=1;i<max;i++)
			count[i]+=count[i-1];
		System.out.println();
		for(int i=0;i<len;i++)
		System.out.print(count[i]+" ");
		
	}

	public static void main(String args[])
	{
		int arr[]={4,2,1,5,7,2,1,7};
		int len=arr.length;
		
		countingSort(arr, len);
				
		
	}

}
