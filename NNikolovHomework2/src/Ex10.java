import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * �������� ����� �� ������������ � ���������� ���� � ������. ������
		 * ����� � ���� ����� �� ���� ���� �� 1 � �� ���� ��.
		 */
		int A; boolean isPrime = true;
		
		System.out.println("Please enter a number so I can tell you if it's a prime number");
		
		Scanner scA = new Scanner(System.in);
		A = scA.nextInt();
		
		for( int x = 2; x < A; x++){
			if( A % x == 0){
				isPrime = false;
				break;
					
			} 
		}
		
		if(isPrime){
			System.out.println(A + " is a prime number");
		} 
		else {
			System.out.println(A + " is not a prime number");
		}
		

		scA.close();

	}

}
