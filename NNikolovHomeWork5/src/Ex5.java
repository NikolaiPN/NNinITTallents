import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ���� ����� �� �������� 2 ������ �� �����
		 * (����).
		 * ��� � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������
		 * ������� ������ ������������, � ������� ����������, ���� �� �� ��
		 * �������� � ����� �� ����.
		 * ��� �������� ����� ��� ���� �� �� ������ ���� ������������
		 * ���������.
		 * ������ :
		 * �
		 * �
		 * �����
		 * �
		 * �
		 * �
		 */
		/*
		 * �� ������� �� �������,�� ������ ������ � �� �������� ���� ��� ������� ������ ������ �� ������� ���� �
		 * ������ ������ �� �������, ������ ��� �� ���� ���� , �������� ������ �� �� �������� �� ������� '�' �� "�������".
		 * �� ���� �� ������� ���������� �� ����� �����.
		 */
		
		System.out.println("Enter two words divided by coma");
		
		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split(",");
		String word1 = split[0];
		String word2 = split[1];
		boolean done = false;
		
		for(int i = 0; i < word1.length();i++){
			if(word1.charAt(i) != word2.charAt(0)){
				System.out.println(word1.charAt(i));
			}else if(word1.charAt(i) == word2.charAt(0)){
				if(!done){
				System.out.println(word2);
				done = true;
				}
			}
		}
		sc.close();
	}

}
