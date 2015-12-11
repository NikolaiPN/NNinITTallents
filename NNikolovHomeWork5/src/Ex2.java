import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		/*
		 * Да се състави програма, чрез която от клавиатурата се въвеждат
		 * последователно две думи с дължина 10-20 знака.
		 * Програмата да размени първите им 5 знака и да изведе дължината на
		 * по-дългата, както и новото им съдържание.
		 * Пример: uchilishe uchenik
		 * Изход: 9 uchenishe
		 */
		/*
		 * До колкото разбрах трябва програмата да изкара в конзолата само резултата на по-дългата дума , за 
		 * това ще го направя по този начин и ще ми изкарва и двете думио само ако дължините им са равни.
		 */

		System.out.println(
				"Enter sentance with length 10 < and < 20 symbols and being constructed of 2 words divided by space");

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		String[] split = word.split("\\s");
		String part1 = split[0];
		String part2 = split[1];
		String part1Changed = part2.substring(0, 5).concat(part1.substring(5, part1.length()));
		String part2Changed = part1.substring(0, 5).concat(part2.substring(5, part2.length()));
		
		System.out.println(part1);
		System.out.println(part2);

		if (word.length() <= 20 && word.length() >= 10) {
			if (part1Changed.length() < part2Changed.length()) {
				System.out.println(part2Changed.length() + " " + part2Changed);
			} else if (part2Changed.length() < part1Changed.length()) {
				System.out.println(part1Changed.length() + " " + part1Changed);
			} else {
				System.out.println("The first word is : " + part1Changed.length() + " " + part1Changed);
				System.out.println("And the second word is : " + part2Changed.length() + " " + part2Changed);
			}
		} else {
			System.out.println("Your String is either less than 10 symbols or more than 20");
		}
		sc.close();

	}

}
