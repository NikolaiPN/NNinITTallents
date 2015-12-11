import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		/*
		 * �� �� �������� 2 ����� �� ������������ � � �. �� �� ������� ������
		 * ����� �� � �� � �� ������ 2(��������� � �������).��� ����� ����� �
		 * ������ �� 3, �� �� ������ ��������� �� ������� �� �������� �skip
		 * 3�.��� ������ �� ������ �������� ����� (��� ������������) �����
		 * ��-������ �� 200, �� �� �������� �����������.
		 */
		
		/* �� ������� ���� ������ �� ���������� ���������� �� ����������� ����� (� ��� ������ num) ������ �� 3
		 * ��� ������� ���������� �� ������ (i*i) ������ �� 3 � �� ���� �� �� �������
		 * skip 3 �� ���� ���������� �� ������ ����, ����� �� ������ �� 3
		 */
		 
		
		int num1, num2, sum=0, lowerNum=0, higherNum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if( num1 < num2 ){
			lowerNum = num1;
			higherNum = num2;
		}
		else{
			lowerNum = num2;
			higherNum = num1;
		}
		System.out.print(lowerNum*lowerNum);
		for(int i = lowerNum + 1 ;sum +(i*i) <= 200 && i <= higherNum ; i++){
			if((i*i) % 3 != 0){
				System.out.print(", " + i*i );
				sum+=(i*i);
			}
			else{
				System.out.print(", skip 3");
			
			}
		}
		System.out.println();
		System.out.println(" The sum is : " + sum);
		sc.close();
	}

}
