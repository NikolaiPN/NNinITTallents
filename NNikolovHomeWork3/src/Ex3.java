import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Да се въведе число, след което да се създаде масив с 10 елемента по
		 * следния начин: Първите 2 елемента на масива са въведеното число.
		 * Всеки следващ елемент на масива е равен на сбора от предишните 2
		 * елемента в масива. След това изведете масива .		 * 
		 */
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		n = sc.nextInt();
		
		int[] array = new int[10];
		array[0] = n;
		array[1] = n;

		for(int i = 2; i < array.length ; i++){
			array[i] = array[i-1] + array[i-2];
		}
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");
		}
		sc.close();
	}

}
