import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Да се въведат от потребителя 2 числа. И да се
		 * изведат на екрана всички числа от по-малкото до по-голямото.
		 */
		
		int Num1 , Num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers ");
		
		System.out.println("Number 1 : ");		
		Num1 = sc.nextInt();
		
		System.out.println("Number 2 : ");
		Num2 = sc.nextInt();
		
		if(Num1 > Num2){
			for (int i = Num2; i <= Num1 ; i++){
				System.out.print(i + " ");
			}
		}
		else {
			for(int i = Num1; i <= Num2; i++){
				System.out.print(i + " ");
			}
		}
		sc.close();
		
	}

}
