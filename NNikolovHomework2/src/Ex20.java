
public class Ex20 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ���� ����� �� ������� ������� �� �����.
		 * ������ �� ���������� �� ���������� ��� ��� ����� �� ����� �� 45.
		 * ������: 
		 * 1 2 3 4 5 6 7 8 9 0
		 * 2 3 4 5 6 7 8 9 0 1 
		 * 3 4 5 6 7 8 9 0 1 2
		 * 4 5 6 7 8 9 0 1 2 3
		 * 5 6 7 8 9 0 1 2 3 4
		 * 6 7 8 9 0 1 2 3 4 5
		 * 7 8 9 0 1 2 3 4 5 6
		 * 8 9 0 1 2 3 4 5 6 7
		 * 9 0 1 2 3 4 5 6 7 8
		 * 0 1 2 3 4 5 6 7 8 9 
		 */
		/*
		 * �� ������� ����� �� ������� � �������� � �� ���� �������� ����������
		 * ������ �� ������� �������� ������� � � �������.
		 */
		for(int row = 1, j = 0; row <= 10; row++, j++){
			for(int pos = 1 + j; pos <= 9; pos++){
				System.out.print(pos);
			}
			System.out.print("0");
			int a = 1;
			while(a <= j){
				System.out.print(a);
				a++;
			}
			System.out.println();
		}	 

	}

}
