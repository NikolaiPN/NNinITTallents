import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
		 * ��������� �����. ���������� �� ������ �������, ����� � ���-������ ��
		 * �������� �������� �� ���������� �����. ������: 1,2,3,4,5,6,7 �����:
		 * ������ �������� 4, ���-������ �������� 4
		 */

		Scanner sc = new Scanner(System.in);
		int avg = 0;
		int res = 0;
		int lowerDif = 2000000;
		int[] array = new int[7];

		System.out.println("PLease enter 7 elements to fill the array");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			res += array[i];
		}
		avg = res / 7;

		for (int i = 0; i < array.length; i++) {

			if (avg == array[i]) {
				System.out.println("The average is " + avg);
				System.out.println("The closer value to the average is " + avg);
				break;
			} else {
				if (avg > array[i]) {
					int Dif = avg - array[i];
					if (Dif < lowerDif) {
						lowerDif = array[i];
					}
				} else if (array[i] > avg) {
					int Dif = array[i] - avg;
					if (Dif < lowerDif && Dif >= 0) {
						lowerDif = array[i];
					}
					System.out.println("The average is " + avg);
					System.out.println("The closer value to the average is " + lowerDif);
				}
			}
		}

		sc.close();
	}

}
