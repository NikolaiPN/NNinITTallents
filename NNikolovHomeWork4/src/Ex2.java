import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Имате квадратен двумерен масив от естествени числа, чийто стойности
		 * се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
		 * Пример: 
		 * 1,4,6,3
		 * 5,9,7,2
		 * 4,8,1,9
		 * 2,3,4,5 
		 * Изход:
		 * 1 9 1 5
		 * 3 7 8 2
		 */
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int[] diagR = new int[4];
		int[] diagL = new int[4];

		// The part for creating the table

		System.out.println("Please enter 4 rowes with 4 elements each");

		for (int row = 0; row < arr.length; row++) {
			System.out.println("Please enter 4 elements for row " + row);
			for (int el = 0; el < arr[row].length; el++) {
				arr[row][el] = sc.nextInt();
				if (el == row) {
					diagL[el] = arr[row][el];
				}
			}

		}

		// The part for finding the right diagonal

		for (int row = arr.length - 1; row >= 0; row--) {
			for (int el = arr[row].length - 1, i = 0; el >= 0 && i < diagR.length; el--, i++) {
				if (el == row) {
					diagR[i] = arr[row][el];
				}
			}

		}
		
		//The part for printing the table
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0) {
					System.out.print("[" + arr[i][j] + ", ");
				} else if (j == arr[i].length - 1) {
					System.out.println(arr[i][j] + "]");
				} else {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}

		// The part for printing the right diagonal

		for (int i = 0; i < diagR.length; i++) {
			if (i == 0) {
				System.out.print("the right diagonal is :" + "[" + diagR[i]);
			} else if (i == diagR.length - 1) {
				System.out.println(", " + diagR[i] + "]");
			} else {
				System.out.print(", " + diagR[i]);
			}
		}

		// The part for printing the left diagonal

		for (int i = 0; i < diagL.length; i++) {
			if (i == 0) {
				System.out.print("the left diagonal is :" + "[" + diagL[i]);
			} else if (i == diagL.length - 1) {
				System.out.println(", " + diagL[i] + "]");
			} else {
				System.out.print(", " + diagL[i]);
			}
		}
		sc.close();

	}

}
