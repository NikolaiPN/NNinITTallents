import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
		 * ���������� ����������� t � ������ ������. �������������� ���������
		 * ��:
		 * ��� -20 ������ �������; 
		 * ����� 0 � -20 - �������; 
		 * ����� 15 � 0 - ������;
		 * ����� 25 � 15 - �����;
		 * ��� 25 � ������.
		 * ������ �����: ����
		 * ����� �� ��������� [-100..100]
		 */
		
		byte t;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter temperature");
		t = sc.nextByte();
		
		if(t <= (-20)){
			System.out.println("It's super ,mega freezing outside. DON" + "'" + "T GO THERE !!!" );
		}
		else if(t <= 0 && t >= (-20)){
			System.out.println("It's Freezing outside.Grab a tick coat");
		}
		else if(t >= 0 && t <= 15){
			System.out.println("It's Chilly outside. Grab a jacket");
		}
		else if(t >= 15 && t <=25){
			System.out.println("It's warm outside. the wild life awaits you ");
		}
		else if(t >= 25){
			System.out.println("IT" + "'" + "S SUMMER TIME.GO TO THE BEACH");
		}
		sc.close();

	}

}
