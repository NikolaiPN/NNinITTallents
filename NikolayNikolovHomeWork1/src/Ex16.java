import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * �������� � ���������� ���������� ����� �� ���� abc. ������ �� ��
		 * ������� ����: ��� a = b = c - �����: ������� �� �����; ��� a>b>c -
		 * �����: ������� �� ��� �������� ���; ��� a<b<c ������� �� � ��������
		 * ���; � �����: ������� �� ����������, �� ����������� ������. �� ��
		 * ������� ��������, ����� ������� ��������� �� ���������� �� ������� ��
		 * ������� � �������. ������: 345 �����: �������� ���.
		 */
		/*
		 * ��� ���� ��� �������������� � ��������� � ������� , �� ������� ���������� �� ��
		 * ������� �����: ��� a<b<c - ������� �� � �������� ���, ��� �� a>b>c -
		 * � �������� ���.
		 */
		int num; int d1, d2, d3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number in the range of 100 to 999");
		num=sc.nextInt();
		
		while(num >=1000 && num<=99){
			num=sc.nextInt();
		}
		d3 = num % 10;
		d2 = (num/10) % 10;
		d1 = ((num / 10) / 10) % 10;
		
		if(d1 == d2 && d1 == d3){
			System.out.println("All of the digits are equal");
		}
		else if(d1 < d2 && d2 < d3){
			System.out.println("The digits are in asending order");
		}
		else if(d1 > d2 && d2 > d3){
			System.out.println("The digits are in descending order");			
		}
		else{
			System.out.println("The digits are not ordered");
		}
		sc.close();

	}

}
