package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "Manikandan";
		int count = 0;
		char find = 'a';
		char arr[] = str.toCharArray();
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			if (arr[i] == find)
				count++;
		}

		System.out.println("The character " + find + " occured " + count + " times");

	}

}