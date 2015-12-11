import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		/*
		 * Напишете програма, в която потребителя въвежда масив, след което
		 * елементите на масива се обръщат в обратен ред (Целта не е масива да
		 * се отпечата в обратен ред, ами първо да се обърне, след което да се
		 * отпечата в нормален ред). Пробвайте да решите задачата първо с един
		 * допълнителен масив и после без да използвате друг масив.
		 */

		int arrL = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("PLease enter the lenght of the array you'll create later");
		arrL = sc.nextInt();

		int[] arr = new int[arrL];

		System.out.println(
				"OK. Now please enter the numbers you want to add in the array and press enter after each one");

		for (int i = arrL - 1; i >= 0; i--) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Your array is :");

		for (int i = arrL - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.println(arr[i] + "]");
			} else if (i == arr.length - 1) {
				System.out.print("[" + arr[i] + ", ");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

		System.out.println("Your inverted array is : ");

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ", ");
			} else if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

		System.out.println("Now your array  in the way you created it is :");

		for (int i = arrL - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(arr[i] + "]");
			} else if (i == arr.length - 1) {
				System.out.print("[" + arr[i] + ", ");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		sc.close();
	}

}
