import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ����� ������� ������� 10 ���-����� �����,
		 * ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ �� ��������
		 * ���������� �����. ������� �� ��������, ������ � ������ ������� �����.
		 * ������ �����: ����� �� ��������� [1..999] ������: 1 �����: 1:2; 2:3,
		 * 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14 ����������� ����� while.		 * 
		 */
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number in the range 1-999");
		n = sc.nextInt();
		while(n<= 0 || n >= 1000){
			System.out.println("You have entered incorrect number.Please try again");
			System.out.println("Please enter a number in the range 1-999");
			n = sc.nextInt();
		}
		int count = 1;
		while(count <= 10){
			n+=1;
			if(n%2 == 0 || n % 3 == 0 || n% 5 == 0){
				System.out.println(n);
				count++;
			}
		}
		sc.close();

	}

}
