import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ���� ����� �� ������� ��������� � �������
		 * ����.
		 * ���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
		 * ���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
		 * ������: ����� ����� ������
		 * �����: ����� ����� ������
		 */

		System.out.println("Enter a sentance");

		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split("\\s");

		for (int word = 0; word < split.length; word++) {
			for (int i = 0; i < split[word].length(); i++) {
				if (i == 0) {
					System.out.print(Character.toUpperCase(split[word].charAt(0)));
				} else if (i == split[word].length() - 1) {
					System.out.print(split[word].charAt(i) + " ");
				} else {
					System.out.print(split[word].charAt(i));
				}
			}
		}
		sc.close();

	}

}
