import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ���� ����� �� ������� ��� �� �������
		 * (������, ���).
		 * ���������� �� ������ �� ������ ���� ��������� ������ � ���������,
		 * �.�. ���� ����� ������-������� � �������-������ � ���� � ���.
		 * ����: �����
		 * �����: ��.
		 * ����: ��������
		 * �����: ��.
		 */
		
		System.out.println("Enter a string without spaces");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		boolean palin = true;
		
		for(int i = 0, j = word.length()- 1; i < word.length()/2 || j >= word.length()/2; i++, j--){
			if(word.charAt(i) != word.charAt(j)){
				palin = false;
				break;
			}
		}
		if(palin){
			System.out.println("The word is palindrome");
		} else {
			System.out.println("The word is not palindrome");
		}
		sc.close();

	}

}
