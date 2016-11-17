package arrays;


//Non zero elememnts, array sorted, Find smallest sum not possible by any combination of adding elements in array
public class SmallestSumNotPossibleInArray {

public static void main(String args[])
{
	//int arr[]={1,3,4,5};
	int arr[] = {1,2,3,4,5,6,7,8};
	System.out.println(getSmallestSubSum(arr));
	
}

private static int getSmallestSubSum(int[] arr) {
	// TODO Auto-generated method stub
	int currSubSum=0;
	int targetSubSum=1;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>targetSubSum)
			return targetSubSum;
		currSubSum+=arr[i];
		targetSubSum=currSubSum+1;
	}
	
	return targetSubSum;
}
}
