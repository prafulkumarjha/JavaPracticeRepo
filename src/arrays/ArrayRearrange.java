package arrays;

class ArrayRearrange {
	void checkArray(int[] array) {
		int oddCount = 0;
		int evenCount = 0;
		for (int entry : array) {
			if (entry % 2 == 0) {
				++evenCount;
			} else {
				++oddCount;
			}
		}
		if (oddCount != evenCount) {
			throw new IllegalArgumentException("there should be same number of odd an even entries");
		}
	}
	void arrangeOddEven(int a[]) 
	{ 
	int size=a.length; 
	for(int i=0;i<size;i++) 
	{ 
	if((i+1)%2==1 && a[i]%2==0) 
	{ 
	int j=i+1; 
	while(j<size && a[j]%2==0) j++; 

	if(j<size) 
	{ 
	int t=a[j]; 
	while(j>i) {a[j]=a[j-1]; j--;} 
	a[j]=t; 
	} 


	}	
	else if((i+1)%2==0 && a[i]%2==1) 
	{ 
	int j=i+1; 
	while(j<size && a[j]%2==1) j++; 

	if(j<size) 
	{ 
	int t=a[j]; 
	while(j>i) {a[j]=a[j-1];j--;} 
	a[j]=t; 
	} 


	}	

	} 
	}
	
	public void swapOddEven(int[] array) {
		checkArray(array);
		int lastEvenImbalance = -1;
		int lastOddImbalance = -1;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] % 2 == 0) {
				if (i % 2 == 0) lastOddImbalance = i;
			} else {
				if (i % 2 != 0) lastEvenImbalance = i;
			}
			if (lastEvenImbalance != -1 && lastOddImbalance != -1) {
				int temp = array[lastEvenImbalance];
				array[lastEvenImbalance] = array[lastOddImbalance];
				array[lastOddImbalance] = temp;
				lastEvenImbalance = -1;
				lastEvenImbalance = -1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2,4,6,5,1,3};
		ArrayRearrange arrayRearrange = new ArrayRearrange();
		arrayRearrange.arrangeOddEven(array);
		for (int entry : array) {
			System.out.print(entry+" ");
		}
	}
}