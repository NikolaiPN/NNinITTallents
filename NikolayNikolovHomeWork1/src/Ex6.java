import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		
		/*
		 * �������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
		 * �� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
		 * �3 �� ��� ������� �������� �� �1.
		 */
		/*
		 * �� ������������ �� ���� ������ ���� �� ���������� ������������ ����������,
		 * ����� �� ��������� ���������� �� � �� ����� �� ��������� �� �����������.
		 */
		
		int A; int B; int C; int Temp;
		System.out.println("Please input 3 numbers :");
		
		Scanner a1 = new Scanner(System.in);
		A = a1.nextInt();
		
		Scanner a2 = new Scanner(System.in);
		B = a2.nextInt();
		
		Scanner a3 = new Scanner(System.in);
		C = a3.nextInt();
		
		System.out.println("The values are : A: " + A + " B: " + B + " C: " + C);
		System.out.println("Now lets swap their values as follows : A becomes B, B becomes C and C becomes A ");
		
		Temp = A;
		A = B;
		B = C;
		C = Temp;
		
		System.out.println("The values are : A: " + A + " B: " + B + " C: " + C);
		
		a1.close();
		a2.close();
		a3.close();
		
		

	}

}
