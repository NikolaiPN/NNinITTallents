import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която по предварително въведени 7 числа
		 * в едномерен масив се разменят местата на елементи с индекси: 
		 * 0 и 1 - чрез трета променлива;
		 * 2 и 3 - чрез събиране; 
		 * 4 и 5 - чрез умножение.
		 * Пример: 1,2,3,4,5,6,7 
		 * Изход: 2,1,4,3,6,5,7
		 */

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];
		int temp = 0;

		System.out.println("Please enter 7 numbers");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Your array is :");

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

		// Changing the values of arr[0] and arr[1] using temp var

		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		// Changing the values of arr[2] and arr[3] using addition
		
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];

		// Changing the values of arr[4] and arr[5] by multiplicating
		
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];

		System.out.println("Your array now looks like :");

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
		sc.close();

	}

}
