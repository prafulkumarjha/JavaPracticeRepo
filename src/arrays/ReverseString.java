package arrays;

public class ReverseString {

	public static void main(String args[]) {
		String str = "Tomorrow";
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length/2; i++) {
			char a = array[i];
			char b = array[array.length - 1 - i];
			char temp = a;
			array[i] = b;
			array[array.length - 1 - i] = temp;

		}

		System.out.println(str);
		System.out.println(array);

	}

}
