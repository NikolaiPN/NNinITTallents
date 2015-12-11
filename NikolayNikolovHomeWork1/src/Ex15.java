import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
		 * [0..24]. ���������� �� ������ ������������� ��������� ���������
		 * ��������� ���. ��������� ��: [18..4] - ����� �����; [4..9] - �����
		 * ����; [9..18] - ����� ��� ������: 10 �����: ����� ���
		 */
		/*
		 * ���������� ����� ����� ���� ��� ����� � �� 4 ���. �� 9 ���. ����� ��� ��� � 
		 * ���� 9 ��� ����� 18 ���. ���� ����� ��� � ��-����� �� 18 ��� �� ���� �� 4.
		 */
		Byte hour;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the time (Write only the hour in 24h format)");
		hour = sc.nextByte();
		
		if(hour<=9 && hour>=4){
			System.out.println("Good Morning");
		}
		else if(hour<=18 && hour>9){
			System.out.println("Good Day");
		}
		else if(hour>18 || hour<4){
			System.out.println("Good Night");
		}
		sc.close();

	}

}
