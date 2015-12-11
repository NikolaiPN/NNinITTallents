import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ���� ����� �� �������� ���������� ����� ��
		 * ��������� [10..99] �� ������� �������� �����, ��� �������� ��
		 * �������� ����������: 1) ��� ����������� ����� � ����� �� �������
		 * 0.5*�������; 2) ��� ����������� ����� � ������� �� ������� 3*�������
		 * +1. ����������� ���������� ������ �� �� ������ �������� 1. ������: 11
		 * �����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.		 * 
		 */
		
		double n , res , half = 0.5, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		n = sc.nextInt();

		while(n <= 9 || n >= 100){
			System.out.println("You have entered incorrect numbers. PLease try again");
			System.out.println("Please enter a number");
			n = sc.nextInt();
		}
		res = n;
		temp = res;
		
		while(res != 1){
			if(res % 2 == 0){
				res = temp * half;
				System.out.print(res + ", ");

			}
			else {
				res = (3 * temp) +1;
				System.out.print(res + ", ");
				
			}
			temp = res;
		}
		sc.close();

	}

}
