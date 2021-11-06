package week1.day2;

public class FindTypes {

	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;

		char arr[] = test.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (Character.isLetter(ch))
				letter++;
			else if (Character.isDigit(ch))
				num++;
			else if (Character.isSpaceChar(ch))
				space++;
			else
				specialChar++;

		}
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("Special Character: " + specialChar);

	}

}