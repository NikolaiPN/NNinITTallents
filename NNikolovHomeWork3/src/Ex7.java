import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * Напишете програма, която първо чете масив и после създава нов масив
		 * със същия размер по следния начин: стойността на всеки елемент от
		 * втория масив да е равна на сбора от предходния и следващият елемент
		 * на съответния елемент от първия масив. Първият и последният елемент
		 * на втория масив трябва да си останат равни на първият и последният от
		 * елемент от първия масив. Да се изведе получения масив. *
		 */
		int arrL = 0;

		System.out.println("How big do you want the array to be?");

		Scanner sc = new Scanner(System.in);
		arrL = sc.nextInt();
		int[] arr = new int[arrL];
		int[] arr2 = new int[arrL];

		if (arrL >= 3) {
			System.out.println("Now please enter " + arrL + " numbers to fill the array");
			for (int i = 0; i < arrL; i++) {
				arr[i] = sc.nextInt();
				if (i == 0 || i == arrL - 1) {
					arr2[i] = arr[i];
				}
			}

			System.out.println("Your array is : ");

			for (int i = 0; i < arrL; i++) {
				if (i == 0) {
					System.out.print("[" + arr[i] + ", ");
				} else if (i == arrL - 1) {
					System.out.println(arr[i] + "]");
				} else {
					System.out.print(arr[i] + ", ");
				}
			}

			System.out.println("and your new array is :");

			for (int a2count = 0, a1count = 0; a2count < arrL - 1; a2count++, a1count++) {
				if (a2count >= 1) {
					arr2[a2count] = arr[a1count - 1] + arr[a1count + 1];
				}
			}
			for (int i = 0; i < arrL; i++) {
				if (i == 0) {
					System.out.print("[" + arr2[i] + ", ");
				} else if (i == arrL - 1) {
					System.out.println(arr2[i] + "]");
				} else {
					System.out.print(arr2[i] + ", ");
				}
			}
		} else {
			System.out.println("Your massive must be with more than 2 elements");
		}
		sc.close();
	}

}
