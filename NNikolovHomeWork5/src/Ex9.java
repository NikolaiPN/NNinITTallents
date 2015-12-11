import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която по въведен низ съдържащ букви,
		 * цифри, знак минус '-' се извежда сборът на въведените числа като се
		 * отчита знакът '-' пред съответното число. Вход: asd-12sdf45-56asdf100
		 * Изход: -12 45 -56 100 Сума = 77
		 */

		System.out.println("Please enter a text: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder inputToNumber = new StringBuilder();
		int sum = 0;

		for (int i = 0; i < input.length(); i++) {

			if (Character.isDigit(input.charAt(i)) && i == 0) { // checks if the
																// first char is
																// digit
				inputToNumber.append(input.charAt(i));
			} else if (Character.isDigit(input.charAt(i))) { // checks all other
																// chars if they
																// are
																// digits
				if (input.charAt(i - 1) == '-') { // if the previous char is '-'
													// then add it
					inputToNumber.append(input.charAt(i - 1));
				}
				inputToNumber.append(input.charAt(i));

			}

			/*
			 * checks if the current char is a digit and the previous are not -
			 * converts the StringBuilder to int, adds it to the total sum and
			 * prints it
			 */

			if (i != 0 && Character.isDigit(input.charAt(i - 1)) && !Character.isDigit(input.charAt(i))) {
				System.out.println(inputToNumber);
				sum += Integer.parseInt(inputToNumber.toString());
				inputToNumber.setLength(0);

				/*
				 * hecks if the last char is a digit - if yes - converts the
				 * StringBuilder to int, adds it to the total sum and prints it
				 */

			} else if (Character.isDigit(input.charAt(i)) && i + 1 == input.length()) {
				System.out.println(inputToNumber);
				sum += Integer.parseInt(inputToNumber.toString());
				inputToNumber.setLength(0);
			}
		}
		System.out.println("The sum is: " + sum);
		sc.close();
	}

}
