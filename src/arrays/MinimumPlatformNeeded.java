/*
 *Given arrival and departure times of all trains that reach a railway station, 
 *find the minimum number of 
 *platforms required for the railway station so that no train waits.
 */

package arrays;

public class MinimumPlatformNeeded {

	
public static void main(String args[])
{
	int arr[] = {900, 940, 950, 1100, 1500, 1800};
    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
    int n = arr.length;
    System.out.println("Minimum Number of Platforms Required = "+findPlatform(arr, dep, n));
         
}

private static int findPlatform(int[] arr, int[] dep, int n) {
	// TODO Auto-generated method stub
	int result=1;
	int plat_needed=0;
	int j=0;
	for(int i=0;i<n;)
	{
		if(arr[i]<dep[j])
		{
			plat_needed++;
			i++;
		}
		else
		{ j++;
			plat_needed--;
		}
			if(plat_needed>result)
			result=plat_needed;
		
	}
	return result;
}
	
}
