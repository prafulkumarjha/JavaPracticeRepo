package arrays;

import java.util.HashSet;

public class UnionIntersectionOfTwoArrays {
	
	public static void main(String args[])
	{
		
		int arr1[] = {1, 2, 4, 5, 6};
		  int arr2[] = {2, 3, 5, 7};
		 
		  printUnion(arr1, arr2, arr1.length, arr2.length);
		  printIntersection(arr1, arr2, arr1.length, arr2.length);
		  printUnionUsingJavaAPIs(arr1,arr2);
		
	}

	private static void printIntersection(int[] arr1, int[] arr2, int length,
			int length2) {
		// TODO Auto-generated method stub
int i=0, j=0;
		System.out.println();
		while(i< length && j<length2)
		{
			if(  arr1[i]==arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
			
			else if ( arr1[i]<arr2[j])
				i++;
			else if( arr1[i]>arr2[j])
				j++;
		}
		
		
		
		
	}

	private static void printUnion(int[] arr1, int[] arr2, int length,
			int length2) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		//System.out.println();
		while(i< length && j<length2)
		{
			if( arr1[i]==arr2[j] )
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				
			}
			
			else if ( arr1[i]<arr2[j])
				System.out.print(arr1[i++]+" ");
			else if(  arr1[i]>arr2[j] )
				System.out.print(arr2[j++]+" ");
		}
		
		while(i<length)
			System.out.print(arr1[i++]+" ");
		while(j<length2)
			System.out.print(arr2[j++]+" ");
	}
	
	private static void printUnionUsingJavaAPIs(int[] arr1, int[] arr2) {
		
		int interSectionArray[] ={0,0,0,0,0} ; 
	HashSet hs = new HashSet<>();
	
	String biggerArray = "first";
	if(arr1.length<arr2.length){
		biggerArray = "second";
	}
	if("first".equalsIgnoreCase(biggerArray)){
		for(int i=0; i<arr2.length; i++){
			hs.add(arr2[i]);
		}
	}

		int j=0;
		for(int i=0; i<arr1.length; i++) {
			if(!hs.add(arr1[i])){
				interSectionArray[j++] = arr1[i];
			} 
			else {
				hs.add(arr1[i]);
			}
		}
	
	int temp = 0 ;
	temp = temp +1;
	}
	

}
