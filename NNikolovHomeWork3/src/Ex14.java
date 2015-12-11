public class Ex14 {

	public static void main(String[] args) {
		/*
		 * Имате предварително въведен едномерен масив, съдържащ реални числа.
		 * Да се състави програма, чрез която се избират само елементи от масива
		 * със стойности от интервала [-2.99..2.99] и се отпечатват в нов масив.
		 * Новият масив да се извежда на екрана. Пример:
		 * 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2 Изход: 0.2; 0.99; 1.4;
		 * 1.2 *
		 */

		double[] arr = { 2.12, 4, -3, -2.1, -3.1, 6, 1, 3.23, -1.32, -3, 0.2 };
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 2.99 && arr[i] >= (-2.99)) {
				counter++;
			}
		}
		System.out.println("The original array is :");

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ", ");
			} else if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
				break;
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

		double[] arr2 = new double[counter];

		for (int i = 0, j = 0; i < counter && j < arr.length; j++) {
			if (arr[j] <= 2.99 && arr[j] >= (-2.99)) {
				arr2[i] = arr[j];
				i++;
			}
		}

		System.out.println("The numbers that are in the range -2.99 to 2.99 are: ");

		if (counter >= 1) {
			for (int i = 0; i < counter; i++) {
				if (i == 0) {
					System.out.print("[" + arr2[i] + ", ");
				} else if (i == counter - 1) {
					System.out.println(arr2[i] + "]");
					break;
				} else {
					System.out.print(arr2[i] + ", ");
				}
			}
		} else {
			System.out.println("There are no numbers in the range -2.99 to 2.99");
		}

	}

}
