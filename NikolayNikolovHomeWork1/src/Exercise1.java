import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		/*
		 * �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
		 * ������������ A � B (���� �� �� � ������� ������� � double). ����� ��
		 * �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B. �� ��
		 * ������ ��������� ��������� �� ���� ���� C � ����� A � B.
		 */
		/* ��� ���� �� ������� ���� ������ �� ����� �������� ��������� ��� ����������� �� 
		 * ���������� ,� ����� expression - � � False ��� �������� ���� ���� ������� � ���� If
		 * statement � �� 1 ���������� �� true � ���� �� false 
		 */
	
		double A;double B; double C;
				
		System.out.println("Please input value for A: ");
		
		Scanner scA = new Scanner(System.in);
		A = scA.nextDouble();
		
		System.out.println("Please input value for B: ");
		
		Scanner scB = new Scanner(System.in);
		B = scB.nextDouble();
		
		System.out.println("So far, so good. Now please enter value for C: ");
		
		Scanner scC = new Scanner(System.in);
		C = scC.nextDouble();

		if(A < C && C < B){
			
			System.out.println("The Value of C is between the values of A and B");
			
		} else if(B < C && C < A){
			
			System.out.println("The Value of C is between the values of A and B");
		
		}else{
			System.out.println("The value of C is not between the values of A and B");
		}
		
		
		scA.close();
		scB.close();
		scC.close();
			
		}
			
	}