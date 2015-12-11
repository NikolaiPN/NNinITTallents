import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която се въвежда изречение с отделни
		 * думи.
		 * Като резултат на екрана да се извежда същия текст, но всяка отделна
		 * дума да започва с главна буква, а следващите я букви да са малки.
		 * Пример: супер яката задача
		 * Изход: Супер Яката Задача
		 */

		System.out.println("Enter a sentance");

		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split("\\s");

		for (int word = 0; word < split.length; word++) {
			for (int i = 0; i < split[word].length(); i++) {
				if (i == 0) {
					System.out.print(Character.toUpperCase(split[word].charAt(0)));
				} else if (i == split[word].length() - 1) {
					System.out.print(split[word].charAt(i) + " ");
				} else {
					System.out.print(split[word].charAt(i));
				}
			}
		}
		sc.close();

	}

}
