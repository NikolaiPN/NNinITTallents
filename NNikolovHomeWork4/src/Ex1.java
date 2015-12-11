import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * ����� �������� ����� 6�5 �� ���������� �����, ����� ��������� ��
		 * �������� �������������. �� �� ������� ��������, ���� ����� ��
		 * �������� ���������� �� ������ � ���-������� � ���-�������� ��������.
		 * ������: 
		 * 48,72,13,14,15
		 * 21,22,53,24,75 
		 * 31,57,33,34,35 
		 * 41,95,43,44,45
		 * 59,52,53,54,55 
		 * 61,69,63,64,65 
		 * �����: ���-����� 13; ���-������ 95
		 */
		/*
		 * �� ��� �������� ������������� �������� ������� , ��� ���� ������,�� � ��-����� �� 
		 * ���� ������������� ������ ����� , ������ ��  � ����������, �� ������� �� �� �����
		 * ������ ������ �� �� ����.
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
