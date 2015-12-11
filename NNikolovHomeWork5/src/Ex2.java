import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		/*
		 * �� �� ������� ��������, ���� ����� �� ������������ �� ��������
		 * �������������� ��� ���� � ������� 10-20 �����.
		 * ���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
		 * ��-�������, ����� � ������ �� ����������.
		 * ������: uchilishe uchenik
		 * �����: 9 uchenishe
		 */
		/*
		 * �� ������� ������� ������ ���������� �� ������ � ��������� ���� ��������� �� ��-������� ���� , �� 
		 * ���� �� �� ������� �� ���� ����� � �� �� ������� � ����� ����� ���� ��� ��������� �� �� �����.
		 */

		System.out.println(
				"Enter sentance with length 10 < and < 20 symbols and being constructed of 2 words divided by space");

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		String[] split = word.split("\\s");
		String part1 = split[0];
		String part2 = split[1];
		String part1Changed = part2.substring(0, 5).concat(part1.substring(5, part1.length()));
		String part2Changed = part1.substring(0, 5).concat(part2.substring(5, part2.length()));
		
		System.out.println(part1);
		System.out.println(part2);

		if (word.length() <= 20 && word.length() >= 10) {
			if (part1Changed.length() < part2Changed.length()) {
				System.out.println(part2Changed.length() + " " + part2Changed);
			} else if (part2Changed.length() < part1Changed.length()) {
				System.out.println(part1Changed.length() + " " + part1Changed);
			} else {
				System.out.println("The first word is : " + part1Changed.length() + " " + part1Changed);
				System.out.println("And the second word is : " + part2Changed.length() + " " + part2Changed);
			}
		} else {
			System.out.println("Your String is either less than 10 symbols or more than 20");
		}
		sc.close();

	}

}
