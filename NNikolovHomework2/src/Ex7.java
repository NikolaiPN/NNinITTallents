import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * ���������� �� 3, �� �� ������� �� ������ ������� n
		 * ����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.
		 */
		
		int Num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		Num = sc.nextInt();
		
		System.out.println("Now i will list you the first N numbers");
		System.out.println("that can by devided by 3");
		
		int Range = Num *3;
		
		for(int i = 3; i <= Range; i +=3){
			System.out.print(i + ", ");
		}
		sc.close();
		
		
	}

}
