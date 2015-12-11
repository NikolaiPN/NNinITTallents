import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		/*
		 * Дадени са два едномерни масива с естествени числа. Да се състави
		 * програма, която сравнява всички числа с еднакви индекси от двата
		 * масива и записва в трети масив, по-голямото от двете числа. Да се
		 * изведе съдържанието и на трите масива 
		 * Пример: 18,19,32,1,3, 4, 5, 6,7, 8 
		 *          1, 2, 3,4,5,16,17,18,27,11 
		 * Изход: 18,19,32 ,4,5,16,17,18,27,11
		 */

		int arrL;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many elements will you store in the arrays ? ");

		arrL = sc.nextInt();
		int[] arr1 = new int[arrL];
		int[] arr2 = new int[arrL];
		int[] arr3 = new int[arrL];

		System.out.println("NOw please enter the elements for the first array :");

		for (int i = 0; i < arrL; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Now please enter the elements for the second array :");

		for (int i = 0; i < arrL; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < arrL; i++) {
			if (arr1[i] < arr2[i]) {
				arr3[i] = arr2[i];
			} else if (arr2[i] < arr1[i]) {
				arr3[i] = arr1[i];
			} else if (arr2[i] == arr1[i]) {
				arr3[i] = arr2[i];
			}
		}
		System.out.println("The elements in the first array are :");

		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr1[i] + ", ");
			} else if (i == arr2.length - 1) {
				System.out.println(arr1[i] + "]");
				break;
			} else {
				System.out.print(arr1[i] + ", ");
			}
		}

		System.out.println("The elements in the second array are :");

		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr2[i] + ", ");
			} else if (i == arr2.length - 1) {
				System.out.println(arr2[i] + "]");
				break;
			} else {
				System.out.print(arr2[i] + ", ");
			}
		}

		System.out.println("The elements in the third array are :");

		for (int i = 0; i < arr3.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr3[i] + ", ");
			} else if (i == arr2.length - 1) {
				System.out.println(arr3[i] + "]");
				break;
			} else {
				System.out.print(arr3[i] + ", ");
			}
		}

		sc.close();

	}

}
