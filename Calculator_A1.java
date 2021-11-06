package week1.day2;

public class Calculator_A1 {

	public int add() {
		int num1 = 2, num2 = 4, num3 = 1;
		System.out.println("Addition is " + (num1 + num2 + num3));
		return 0;
	}
	
	
	public int sub() {
		int num1 = 20, num2 = 10;
		System.out.println("Subtraction is " + (num1 -num2));
		return 0;

	}
	
	public int multiply() {
		int num1 = 20, num2 = 10;
		System.out.println("Multiplication is " + (num1*num2));
		return 0;

	}
	
	public int division() {
		int num1 = 20, num2 = 10;
		System.out.println("Division is " + (num1/num2));
		return 0;

	}

	public static void main(String[] args) {
		Calculator_A1 operations = new Calculator_A1();

		operations.add();
		operations.sub();
		operations.multiply();
		operations.division();

	}

}
