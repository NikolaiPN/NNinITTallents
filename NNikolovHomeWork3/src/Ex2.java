import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Нека по въведен масив да се конструира нов, като половината му
		 * елементи са точно като на оригиналния, а другите да са тези елементи,
		 * но в обратен ред. Последно, да се изведе новия масив на екрана. *
		 */
		Scanner sc = new Scanner(System.in);
		int arrL = 0;

		System.out.println("How many elementes will be stored in the array?");
		arrL = sc.nextInt();

		int[] array = new int[arrL];
		int[] newarray = new int[arrL];

		if (arrL >= 2) {

			System.out.println("Now please enter the elements and press enter after each one");

			for (int i = 0; i < arrL; i++) {
				array[i] = sc.nextInt();
			}

			for (int i = 0; i < array.length / 2; i++) {
				newarray[i] = array[i];
			}
			for (int j = (array.length / 2), i = array.length - 1; j < array.length
					&& i >= array.length / 2; j++, i--) {
				newarray[i] = array[j];
			}

			for (int i = 0; i < array.length; i++) {
				if (i == 0) {
					System.out.print("[" + newarray[i] + ",");
				} else if (i == array.length - 1)
					System.out.println(newarray[i] + "]");
				else {
					System.out.print(newarray[i] + ", ");
				}
			}
		} else {
			System.out.println("The minimum number of element in the array is 2");
		}
		sc.close();
	}
}