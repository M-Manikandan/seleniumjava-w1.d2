package week1.day2;

import java.util.Arrays;

public class MissingArrayElement {

	public static void main(String[] args) {
		int[] array = { 1, 2 ,3, 5 };
		// Sorting
		Arrays.sort(array);
		// Loop
		for (int i = array[0]; i <= array.length; i++) {

			if (i != array[i - 1]) {
				System.out.println("The missing number is " + i);
				break;

			}

		}

	}

}
