import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ����� �� �������� ���������� �� 2 ������� ��
		 * ���������� ����� ������� ������� ���� �� �������� � ������� ���
		 * �������� ����. ���������� ����� � ���������. �������� �� ��� ������
		 * ����� �� ��������� [1..8]. ������: 2 2 3 2 �����: ��������� �� �
		 * �������� ����
		 * 
		 */
		/*
		 * In my chess board the colored fields start from 1
		 */
		
		byte row1, row2, col1, col2 ; boolean num1Color = true, num2Color = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input coordinates for the first field in the range of 1-8");
		row1 = sc.nextByte();
		col1 = sc.nextByte();
		
		System.out.println("Now please enter coordinates for the second field in the range of 1-8");
		row2 = sc.nextByte();
		col2 = sc.nextByte();
		
		if(row1>=1 && row1<=8 && col1>=1 && col1<=8 && row2>=1 && row2<=8 && col2>=1 && col2<=8 ){
			if(row1 == col1 || (row1%2!=0 && col1%2!=0)|| (row1%2 ==0 && col1%2==0)){
				
				num1Color = true;
			} 
			else{
				num1Color = false;
			}
			if(row2 == col2 || (row2%2!=0 && col2%2!=0)|| (row2%2 ==0 && col2%2==0)){
				num2Color = true;
			} 
			else{
				num2Color = false;
			}
			if(num1Color == num2Color){
				System.out.println("Both of the fields are colored");
			}
			else{
				System.out.println("The fields color don't match");
			}
		}
		else{
			System.out.println("You have entered wrong numbers. Try again by pressing F11");
		}
		sc.close();
	}
}
