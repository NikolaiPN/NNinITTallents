
public class Ex23 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ����� ���� ����� while ������� ��������� ��
		 * ���������, �� ��� ����������. �.�. ��� � �������� 4*5 �� �� �������
		 * 5*4. ������: 
		 * 1-�� ���: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9;
		 * 2-�� �e�: 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9; ... 
		 * 9-�� ���: 9*9;
		 */

		int row = 1; int j =0;
		while(row<=9){
			j = row;
			while(j <=9){
				System.out.print(row*j + ", ");
				j++;
			}
			row++;
			System.out.println();
		}
		

	}

}
