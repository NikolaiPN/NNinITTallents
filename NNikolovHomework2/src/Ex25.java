import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ����� �� ������ ����� N, �� ��������� N!,
		 * �.�. 1*2*3*4...*N. 
		 * ������: 5 
		 * �����: 120
		 * ����������� ����� do-while.
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
