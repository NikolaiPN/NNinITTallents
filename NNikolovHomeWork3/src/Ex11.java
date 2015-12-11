import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която въвежда от клавиатурата 7 цели числа в
		 * едномерен масив Програмата да изведе всички числа кратни на 5, но по
		 * големи от 5 . 
		 * Пример: -23, -55, 17, 75, 56, 105, 134 
		 * Изход: 75,105 - 2 числа
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		int counter = 0;

		System.out.println("PLease enter 7 elements to fill the array");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Your array is :");
		
		for (int i = 0;i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i] + ", ");
			} else if (i == array.length-1) {
				System.out.println(array[i] + "]");
				break;
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++){
			if(array[i] % 5 == 0 && array[i] > 5){
				if(counter > 0){
				System.out.print("," + array[i]);
				}
				else{
					System.out.print(array[i]);
				}
				counter++;
			}
		}
		System.out.println(" - " + counter + " numbers");
		sc.close();
	}

}
