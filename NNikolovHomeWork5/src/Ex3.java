import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която се въвеждат последователно две
		 * редици от символи без интервали.
		 * Програмата да извежда съобщение за резултата от сравнението им по
		 * позиции.
		 * Пример: хипопотам, хипопотук
		 * Изход:
		 * Двата низа са с равна дължина.
		 * Разлика по позиции:
		 * 8 а-у
		 * 9 м-к
		 */

		System.out.println("Enter two strings divided by coma and don't use spaces");

		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split(",");
		String part1 = split[0];
		String part2 = split[1];
		int count = 0;

		System.out.println("The differences in the strings are: \nP: Dif:");

		if (part1.length() < part2.length()) {
			for (int i = 0; i < part1.length(); i++) {
				if (part1.charAt(i) != part2.charAt(i)) {
					System.out.println((i + 1) + " " + part1.charAt(i) + " - " + part2.charAt(i));
					count++;
				}
			}
			for (int i = part1.length(); i < part2.length(); i++) {
				System.out.println((i + 1) + " *" + " - " + part2.charAt(i));
				count++;
			}
		} else if (part2.length() < part1.length()) {
			for (int i = 0; i < part2.length(); i++) {
				if (part1.charAt(i) != part2.charAt(i)) {
					System.out.println((i + 1) + " " + part1.charAt(i) + " - " + part2.charAt(i));
					count++;
				}
			}
			for (int i = part2.length(); i < part1.length(); i++) {
				System.out.println((i + 1) + part1.charAt(i) + " - " + "*");
				count++;
			}
		} else if (part1.length() == part2.length()) {
			for (int i = 0; i < part2.length(); i++) {
				if (part1.charAt(i) != part2.charAt(i)) {
					System.out.println((i + 1) + " " + part1.charAt(i) + " - " + part2.charAt(i));
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("There are no differences in the strings");
		}
		sc.close();
	}

}
