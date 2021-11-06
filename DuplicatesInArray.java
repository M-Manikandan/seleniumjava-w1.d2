package week1.day2;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 12, 4, 2, 8, 4, 10, 12, 2, 1 };

		int count;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			count = 0;

			for (int j = i; j < len - 1; j++)

				if (arr[i] == arr[j])
					count = count + 1;
			if (count > 1)
				System.out.println(arr[i]);

		}

	}

}
