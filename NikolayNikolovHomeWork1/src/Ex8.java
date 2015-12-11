import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		/*
		 * Да се състави програма, която чете от конзолата 4-цифренo естествено
		 * число от интервала [1000.. 9999]. От това число се формират 2 нови
		 * 2-цифрени числа. Първото число се формира от 1-та и 4-та цифра на
		 * въведеното число. Второто число се формира от 2-рa - 3-та цифра на
		 * въведеното число. Като резултат да се изведе дали 1-то ново число e
		 * по-малко <, равно = или по-голямо от 2-то число.
		 */

		int Num, d1, d2, d3, d4, Result1, Result2;

		System.out.println("Please enter a number in the range 1000-9999");
		Scanner sc = new Scanner(System.in);
		Num = sc.nextInt();

		while (Num < 1000 || Num > 9999) {
			System.out.println("The number you have entered is incorrect. Try again");
			Num = sc.nextInt();
		}

		if (Num > 1000 && Num < 9999) {

			d4 = Num % 10;
			Num /= 10;
			d3 = Num % 10;
			Num /= 10;
			d2 = Num % 10;
			Num /= 10;
			d1 = Num % 10;

			Result1 = d1 + d4;
			Result2 = d2 + d3;

			System.out.println("The sum of the 1 and 4 digits of the number is: " + Result1);
			System.out.println("The sum of the 2 and 3 digits of the number is: " + Result2);

		}

		sc.close();

	}

}
