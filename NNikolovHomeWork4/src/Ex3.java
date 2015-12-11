import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Имате двумерен масив от числа, чийто стойности са въведени
		 * предварително. Да се отпечатат сумата на елементите на масива, както
		 * и средноаритметичното на тези числа.		 * 
		 */
		/*
		 * Не съм направил предварително въведена матрица , тъй като смятам,че е по-добре да 
		 * имам потребителски входни данни , когато не  е необходимо, от колкото да ги нямам
		 * когато трябва да ги имам.
		 */
		int rows = 0;
		int cols = 0;
		double res = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows do you want to have in your array ?");
		rows = sc.nextInt();
		
		System.out.println("How many columns do you want to have in your array ?");
		cols = sc.nextInt();
		
		
		
		System.out.println("Now please enter the elements you want in the array");
		
		// Creating the table
		
		int[][] arr = new int[rows][cols];
		for(int row = 0; row < arr.length; row++){
			System.out.println("Enter " + cols + " elements for row " + row);
			for(int col = 0; col < arr[row].length; col ++){
				arr[row][col] = sc.nextInt();
				res += arr[row][col];
			}
			
		}
		// Printing the table
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (col == 0) {
					System.out.print("[" + arr[row][col] + ", ");
				} else if (col == arr[row].length - 1) {
					System.out.println(arr[row][col] + "]");
				} else {
					System.out.print(arr[row][col] + ", ");
				}
			}
		}
		
		System.out.println("The sum of the elements in the array is : " + res);
		System.err.println("The average of the elements in the array is : " + res/(rows*cols));
		
		sc.close();

	}
}
