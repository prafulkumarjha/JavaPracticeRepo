package arrays;

public class AlternativePositiveAndNegative {

	public static void main(String[] args) {
		int array[] = { -1, -2, -3, 1, 2, 3 };
		int array1[] = new int[array.length];
		int positive = 0;
		int negative = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array1[negative] = array[i];
				negative += 2;
			} else {
				array1[positive] = array[i];
				positive += 2;
			}
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

	}

}
