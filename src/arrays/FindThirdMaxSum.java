package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindThirdMaxSum {

	@SuppressWarnings("unchecked")
	static int getThirdMaxSumArray(int arr[]) {
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<>(); 
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		int len = list.size();
		int third_max_sum = 0;
		third_max_sum = Integer.parseInt(list.get(len-1).toString())+ Integer.parseInt(list.get(len-4).toString());
		return third_max_sum;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {3,6,2,7,8,19,13,5};
		System.out.println("Third Max sum : "+getThirdMaxSumArray(arr));
		
	}
}
