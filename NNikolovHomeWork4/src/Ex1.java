import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * Имате двумерен масив 6х5 от естествени числа, чийто стойности са
		 * въведени предварително. Да се състави програма, чрез която се
		 * извеждат елементите от масива с най-малката и най-голямата стойност.
		 * Пример: 
		 * 48,72,13,14,15
		 * 21,22,53,24,75 
		 * 31,57,33,34,35 
		 * 41,95,43,44,45
		 * 59,52,53,54,55 
		 * 61,69,63,64,65 
		 * Изход: най-малко 13; най-голямо 95
		 */
		/*
		 * Не съм направил предварително въведена матрица , тъй като смятам,че е по-добре да 
		 * имам потребителски входни данни , когато не  е необходимо, от колкото да ги нямам
		 * когато трябва да ги имам.
		 */

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][5];
		int max = 0;
		int min = 2000000000;

		System.out.println("Please enter 30 elements to create a matrix. I will guide you");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter 5 elements in row : " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] > max){
					max = arr[i][j];
				}
				if(arr[i][j] < min){
					min = arr[i][j];
				}
			}
		}

		System.out.println("The matrix you have created is :");
		
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
		
		System.out.println("The smallest number in the matrix is : " + min);
		System.out.println("The largest number in the matrix is : " + max);
		
		sc.close();
	}

}
