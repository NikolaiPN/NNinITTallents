import java.util.Scanner;


public class Ex7 {

	public static void main(String[] args) {
		
		/*
		 * �������� 3 ���������� �� ������������ � ��� (���������� ���), ����
		 * ���� (����� � ������� �������), ���� ��� ����� � ����� ���. ���������
		 * ��������, ����� ����� ������� �� ������ �� ���� ����� �� �������
		 * �����: - ��� ��� �����, ���� �� ������� - ��� ���� ����, �� �� ����
		 * ��������� - ��� ����� � �� ���� ����� � �� ��� ��� - ��� ��� �����,
		 * �� ����� �� ���� � �������� - ��� ���� ��-����� �� 10 ��, �� ����� ��
		 * ����. ���������� ������� �������� ���� ��������� � ���������.
		 */
		/*
		 * �� ������� ����� � ������ �� ���� � �������� �� ���������� ���, �� ��� 
		 * ��� �� ���� ���� ���������� , ������� �� �� ��� � ���������.
		 */

		byte Haur; double Money; boolean AmIHealty;
		System.out.println("Please input Hour, Money and true/false for being Healty/Sick :");
		
		Scanner H = new Scanner(System.in);
		Haur = H.nextByte();
		
		Scanner M = new Scanner(System.in);
		Money = M.nextDouble();
		
		Scanner AIH = new Scanner(System.in);
		AmIHealty = AIH.nextBoolean();
		
		if(AmIHealty == false){
			
			if(Money > 60){
				
				System.out.println("I will buy drugs and stay home");
			
			} else {
				
				System.out.println("I will stay home and dring tea");
			
			}
				
		} else {
			
			if(Money >= 10){
				
				System.out.println("I will go to the cinema with my friends");
				
			} else {
				
				System.out.println("I will go to the Caffee with my friends");
			
			}
			
		}
		
		H.close();
		M.close();
		AIH.close();
		
	}

}
