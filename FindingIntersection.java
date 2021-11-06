package week1.day2;

public class FindingIntersection {

	public static void main(String[] args) {

		int arr1[] = { 111, 114, 145, 67, 99, 235};
		int arr2[] = { 321, 145, 235, 334, 99, 197 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++)

				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
		}

	}

}