
public class Ex16 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ���� ����� ������������� �������� 10 ������
		 * ����� �� ��������� �� ���������� �� ������� �����: 
		 * 1. ������� �������������� �����. 
		 * 2. ������ �������� ��� �������� ��-�����
		 * ��-0.231 �� ������� ��������� �� �������� �� �������� �� ����� +
		 * ������� 41.25, � ������ �������� �������� �� ������� � ��������������
		 * ����� ����� ������� � �������� ������� �����. ��������� ����� ��
		 * ������� ������� � 1. 
		 * 3. �� �� ������� ���������� �� �������� � ��������������� �����. 
		 * ������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5,8.6, 9.1, -4 
		 * �����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8,81.9,141.25
		 */
		/*
		 * ��� �������,�� ���������� ����� ������ �� �� � ����� ��������, ��
		 * ������ �������� �� � �������, ���� �� ���� �� �� ������ ��������
		 * �������� �� ���� �� ��������� ��� ����������.
		 */

		double[] arr = { -2.32, -1.43, -0.123, 2.32, 5.12, -0.232, 1.22, 3.41, 4, -3 };
		double[] arr2 = new double[10];

		for (int i = 0, j = 0; i < arr.length && j < arr2.length; i++, j++) {
			if (arr[i] <= (-0.232)) {
				arr2[j] = ((i + 1) * (i + 1)) + 41.25;
			} else {
				arr2[j] = arr[i] * (i + 1);
			}
		}
		System.out.println("The elements in the original array are :");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ", ");
			} else if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
				break;
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

		System.out.println("The elements in the new array are :");

		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr2[i] + ", ");
			} else if (i == arr2.length - 1) {
				System.out.println(arr2[i] + "]");
				break;
			} else {
				System.out.print(arr2[i] + ", ");
			}
		}
	}

}
