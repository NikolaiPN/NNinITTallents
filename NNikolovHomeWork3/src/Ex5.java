public class Ex5 {

	public static void main(String[] args) {
		/*
		 * �������� ��������, ����� ������� ����� � 10 �������� � ������������
		 * ����� �� ���������� ��� ��������, ����� �� ������� �� ��������,
		 * ������� �� 3. �� �� ������� ���������� �� ������.		 * 
		 */

		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++){
			array[i] = i*3;
			if (i == 0) {
				System.out.print("[" + array[i] + ", ");
			} else if (i == array.length-1) {
				System.out.println(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}

	}

}
