import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		/*
		 * ���� ����� X � ���������, a�� �� ���� ������� ������ ����� � �����
		 * ������. �� �� ������� ��������, ����� ��������� ���� �������� ����� �
		 * ���������. ������ �����: N - ���������� ����� �� ��������� [10 ..
		 * 30000]. ������: 17571 �����: ������� � ��������� ����������� �����
		 * do-while.		 * 
		 */
		
		short x; boolean isPal = true;
		int d1,d2,d3,d4,d5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a number in the range 10-30000");
		x = sc.nextShort();
		
		if(x<=999 && x >=100){
			d3 = x % 10;
			d2 = (x/10)%10;
			d1 = ((x/10));
			
		}


	}

}
