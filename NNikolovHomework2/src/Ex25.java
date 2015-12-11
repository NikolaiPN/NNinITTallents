import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		/*
		 * Да се направи програма, която по дадено число N, да изчислява N!,
		 * т.е. 1*2*3*4...*N. 
		 * Пример: 5 
		 * Изход: 120
		 * Използвайте цикъл do-while.
		 */

		int res = 1;
		int n;
		int count = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter number");
		n = sc.nextInt();

		do {
			res *= count;
			count++;
		} while (count <= n);

		System.out.println(res);

		sc.close();
	}

}
