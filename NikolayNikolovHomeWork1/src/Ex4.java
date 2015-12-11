import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		
		/* 
		 * Въведете 2 различни числа от конзолата и ги разпечатайте в
		 * нарастващ ред.
 		 */
		
		int A; int B;
		
		System.out.println("Please input 2 numbers : ");
		
		Scanner scA = new Scanner(System.in);
		A = scA.nextInt();
		
		Scanner scB = new Scanner(System.in);
		B = scB.nextInt();
		
		if(A > B){
			
			System.out.println("The lower number is : " + B);
			System.out.println("And the higher number is : " + A);
			
		} else {
		
			System.out.println("The lower number is : " + A);
			System.out.println("And the higher number is : " + B);
		
		}
		
		scA.close();
		scB.close();
	
	}
}
