import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ����� �� ������(���������) � �� ��
		 * ������ ����� �� ������ ����� ����� 1 � ���������� �����.
		 */
		
		int Num; int Result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		Num = sc.nextInt();
		
		for(int i = 1; i <= Num; i++){
			Result += i;
		}
		System.out.println("The Result of summing the numbers from 1 to yours is :");
		System.out.println(Result);
		sc.close();

	}

}
