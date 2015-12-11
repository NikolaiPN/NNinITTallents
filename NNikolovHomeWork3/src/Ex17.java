import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/*
		 * Една редица от естествени числа ще наричаме зигзагообразна нагоре,
		 * ако за елементите и са изпълняват условията:
		 * N1 < N2 > N3 < N4 > N5<.. 
		 * Съставете програма, която проверява дали въведени в едномерен
		 * масив редица от числа изпълняват горните изисквания. 
		 * Пример: 1 3 2 4 3 7 
		 * Изход: изпълнява изискванията за зигзагообразна нагоре редица		 * 
		 */

		boolean isZigZag = true;
		int arrL = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("How many elements will be stored in the array ?");

		arrL = sc.nextInt();
		int[] arr = new int[arrL];

		System.out.println("Now please enter the elements and press enter after each one");

		for (int i = 0; i < arrL; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arrL; i++) {
			if (i >= 1 && i % 2 == 0) {
				if (arr[i] >= arr[i - 1]) {
					isZigZag = false;
					break;
				} else {
					isZigZag = true;
				}
			} else if (i >= 1 && i % 2 == 1) {
				if (arr[i] <= arr[i - 1]) {
					isZigZag = false;
					break;
				} else {
					isZigZag = true;
				}
			}
		}
		if (isZigZag) {
			System.out.println("The array is ZigZag");
		} else {
			System.out.println("The array is NOT ZigZag");
		}
		sc.close();

	}

}
