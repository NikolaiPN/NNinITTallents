import java.util.Scanner;


public class Ex17 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ����� ������� �������, ����� ������ ��
		 * �������� ��� ����� *, � ������������ � ��������� ��� ������� ����.
		 * ������ ����� b - ������� �� �������� ����� �� ��������� [3..20], c -
		 * ����� ����. ���������� �� �������� ����� for. ������: 4 + �����:
		 * ****
		 * *++* 
		 * *++*
		 * ****
		 */
		
		int b; char c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number for the length of b : ");
		b = sc.nextInt();
		
		System.out.println("Now please enter the desired char for b's insight : ");
		c = sc.next().charAt(0);
		
		for(int row = 1; row <= b; row++){
			for(int pos = 1; pos <= b; pos++){
				if(row == 1 || row == b){
					System.out.print('*');
				}
				else{
					if(pos == 1 || pos == b){
						System.out.print('*');
					}
					else{
						System.out.print(c);
					}		
				}
			}
			System.out.println();

		}
		sc.close();
	}

}
