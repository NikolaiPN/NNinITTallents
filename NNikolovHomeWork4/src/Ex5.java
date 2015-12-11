
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ��� ����� ������������� �� ��������
		 * ���������� ����� � �������� ����� 4*4 ��������. ���������� �� �������
		 * �������� �� ���������� ����� � ������������� �� ���-�������� ���� ��
		 * ������ ������ ���-�������� ���� �� ������. ������: 1,2,3,4 5,6,7,8
		 * 9,10,11,12 13,14,15,16 �����: ���-������ ���� �� ������ 58 ���-������
		 * ���� �� ������ 40 ������������ ���� �� ������ � > �� ������������
		 * ���� �� ������
		 */

		int rowMax = 0;
		int sumRow = 0;
		int colMax = 0;
		int sumCol = 0;
		int[][] arr = { 
				{ 7, 5, 4, 8 },
				{ 5, 6, 7, 8 },
				{ 12, 15, 9, 33 },
				{ 13, 14, 15, 16 }
		};

		// Finding the max sum of the rows and the max sum of the columns

		for (int row = 0; row < arr.length; row++) {
			sumRow = 0;
			sumCol = 0;
			for (int col = 0; col < arr[row].length; col++) {
				sumRow += arr[row][col];
				sumCol += arr[col][row];
			}
			if (sumRow > rowMax) {
				rowMax = sumRow;
			}
			if (sumCol > colMax) {
				colMax = sumCol;
			}
		}

		System.out.println("The max sum in the columns is:" + colMax);
		System.out.println("The max sum in the rows is: " + rowMax);
		if (colMax > rowMax) {
			System.out.println("The max sum in the columns is > than the max sum in rows");
		} else {
			System.out.println("The max sum in rows is > than the max sum in columns");
		}

	}

}
