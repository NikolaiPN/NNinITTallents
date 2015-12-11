import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		/*
		 * Напишете програма, която намира и извежда най-дългата редица от
		 * еднакви поредни елементи в даден масив. *
		 */
		int arrL = 0, counter = 1, counterMax = 0, maxNum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("PLease enter the lenght of the array you'll create later");
		arrL = sc.nextInt();

		int[] arr = new int[arrL];

		System.out.println(
				"OK. Now please enter the numbers you want to add in the array and press enter after each one");

		for (int i = 0; i < arrL; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arrL; i++) {
			if (i >= 1 && arr[i] == arr[i - 1]) {
				counter++;
				if (counterMax < counter) {
					counterMax = counter;
					maxNum = arr[i];
				}
			} else if (i >= 1 && arr[i] != arr[i - 1]) {
				counter = 1;
			}
		}
		System.out.println("Your array is :");

		for (int i = 0; i < arrL; i++) {
			if (arrL >= 2) {
				if (i == 0) {
					System.out.print("[" + arr[i] + ", ");
				} else if (i == arrL - 1) {
					System.out.println(arr[i] + "]");
				} else {
					System.out.print(arr[i] + ", ");
				}
			} else if (arrL == 1) {
				System.out.println("[" + arr[i] + "]");
			}

		}
		if (arr[0] >= 1 && counterMax >= 1) {
			for (int i = 0; i < counterMax; i++) {
				arr[i] = maxNum;
				if (i == 0) {
					System.out.print("[" + arr[i] + ", ");
				} else if (i == counterMax - 1) {
					System.out.println(arr[i] + "]");
				} else {
					System.out.print(arr[i] + ", ");
				}
			}
		} else if (arr[0] == 0 || counterMax == 0) {
			System.out.println("Your array doesn't contain repeatable numbers");
		}
		sc.close();
	}

}
