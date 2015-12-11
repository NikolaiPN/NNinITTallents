import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		/*
		 * �� �� ������� ��������, ����� ���� �� ��������� 4-������o ����������
		 * ����� �� ��������� [1000.. 9999]. �� ���� ����� �� �������� 2 ����
		 * 2-������� �����. ������� ����� �� ������� �� 1-�� � 4-�� ����� ��
		 * ���������� �����. ������� ����� �� ������� �� 2-�a - 3-�� ����� ��
		 * ���������� �����. ���� �������� �� �� ������ ���� 1-�� ���� ����� e
		 * ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
		 */

		int Num, d1, d2, d3, d4, Result1, Result2;

		System.out.println("Please enter a number in the range 1000-9999");
		Scanner sc = new Scanner(System.in);
		Num = sc.nextInt();

		while (Num < 1000 || Num > 9999) {
			System.out.println("The number you have entered is incorrect. Try again");
			Num = sc.nextInt();
		}

		if (Num > 1000 && Num < 9999) {

			d4 = Num % 10;
			Num /= 10;
			d3 = Num % 10;
			Num /= 10;
			d2 = Num % 10;
			Num /= 10;
			d1 = Num % 10;

			Result1 = d1 + d4;
			Result2 = d2 + d3;

			System.out.println("The sum of the 1 and 4 digits of the number is: " + Result1);
			System.out.println("The sum of the 2 and 3 digits of the number is: " + Result2);

		}

		sc.close();

	}

}
