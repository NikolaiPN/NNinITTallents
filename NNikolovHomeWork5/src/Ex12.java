import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� �����, ����� ������ �� ������ ����� ����� N � �����
		 * ����� �� ����� � ������� N, ����� ������� ������ ����� �� 1 �� N.
		 */

		System.out.println("Enter the length of the array you want to create");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		creatingArray(input);
		sc.close();

	}

	static void creatingArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			if (i == 0) {
				System.out.print("[" + array[i] + " ");
			} else if (i == array.length - 1) {
				System.out.println(array[i] + "]");
				break;
			} else {
				System.out.print(array[i] + " ");
			}
		}
	}

}