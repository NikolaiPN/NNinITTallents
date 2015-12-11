import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Да се прочете масив и да се отпечата дали е огледален. Следните
		 * масиви са огледални: [3 7 7 3] [4] [1 55 1] [6 27 -1 5 7 7 5 -1 27 6]
		 */
		int n;
		boolean isMirrored = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many elements do you want to store in your array");
		n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.println("please enter a value for the " + i + " element:");
			array[i] = sc.nextInt();
		}

		if (n == 1) {
			isMirrored = true;
		} else if (n % 2 == 0) {
			for (int i = 0, j = array.length - 1; i < array.length / 2 - 1 && j > array.length / 2; i++, j--) {
				if (array[i] == array[j]) {
					isMirrored = true;
				} else {
					isMirrored = false;
				}
			}
		} else if (n % 2 != 0) {
			for (int i = 0, j = array.length - 1; i < array.length / 2 - 1 && j > array.length / 2 + 1; i++, j--) {
				if (array[i] == array[j]) {
					isMirrored = true;
				} else {
					isMirrored = false;
				}
			}
		}
		for(int i = 0; i < array.length;i++){
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		if(isMirrored == true){
			System.out.println("The array is Mirrorred ");
		}
		else{
			System.out.println("The array is NOT Mirrorred");
		}
		sc.close();
	}
}
