import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * ƒа се прочете масив и да се намери най-малкото число кратно на 3 от
		 * масива. 10, 3, 5, 8, 6, -3, 7 Ќай-малкото число кратно на 3 е -3
		 */
		Scanner sc = new Scanner(System.in);
		int arrL = 0;
		int lNum = 200000000;
		int value = 0;

		System.out.println("How many elementes will be stored in the array?");
		arrL = sc.nextInt();

		int[] array = new int[arrL];

		System.out.println("Now please enter the elements and press enter after each one");

		for (int i = 0; i < arrL; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			value = array[i];
			if (value <= lNum && value % 3 == 0) {
				lNum = value;
			}
		}
		if(lNum != 200000000){
		System.out.println("The lowest number in the array that can be divided by 3 is : " + lNum);
		}
		else{
			System.out.println("There are no numbers that can by divided by 3 in the array");
		}
		sc.close();

	}

}
