import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която се въвеждат 7 цели числа в
		 * едномерен масив. Програмата да изведе числото, което е най-близко до
		 * средната стойност на въведените числа. Пример: 1,2,3,4,5,6,7 Изход:
		 * средна стойност 4, най-близка стойност 4
		 */

		Scanner sc = new Scanner(System.in);
		int avg = 0;
		int res = 0;
		int lowerDif = 2000000;
		int[] array = new int[7];

		System.out.println("PLease enter 7 elements to fill the array");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			res += array[i];
		}
		avg = res / 7;

		for (int i = 0; i < array.length; i++) {

			if (avg == array[i]) {
				System.out.println("The average is " + avg);
				System.out.println("The closer value to the average is " + avg);
				break;
			} else {
				if (avg > array[i]) {
					int Dif = avg - array[i];
					if (Dif < lowerDif) {
						lowerDif = array[i];
					}
				} else if (array[i] > avg) {
					int Dif = array[i] - avg;
					if (Dif < lowerDif && Dif >= 0) {
						lowerDif = array[i];
					}
					System.out.println("The average is " + avg);
					System.out.println("The closer value to the average is " + lowerDif);
				}
			}
		}

		sc.close();
	}

}
