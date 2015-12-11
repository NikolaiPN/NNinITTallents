import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		
		/*
		 * Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
		 * ред.
		 */
		
		int A; int B; int C;
		
		System.out.println("Please input 3 numbers so i can reorder them : ");
		
		Scanner scA = new Scanner(System.in);
		A = scA.nextInt();
		
		Scanner scB = new Scanner(System.in);
		B = scB.nextInt();
		
		Scanner scC = new Scanner(System.in);
		C = scC.nextInt();
		
		if(A < B && A < C){
		
			if(B < C){
				
				System.out.println("The numbers listed from lower to higher are :");
				System.out.println(A);
				System.out.println(B);
				System.out.println(C);
		
			} else {
			
				System.out.println("The numbers listed from lower to higher are :");
				System.out.println(A);
				System.out.println(C);
				System.out.println(B);
			}

		} else if(B < A && B < C){
			
			if(A < C){
			
				System.out.println("The numbers listed from lower to higher are :");
				System.out.println(B);
				System.out.println(A);
				System.out.println(C);
			
			} else {
				
				System.out.println("The numbers listed from lower to higher are :");
				System.out.println(B);
				System.out.println(C);
				System.out.println(A);
			}
			
		} else {
		
			if(A < B){
			
			System.out.println("The numbers listed from lower to higher are :");
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
			
			} else {
			
				System.out.println("The numbers listed from lower to higher are :");
				System.out.println(C);
				System.out.println(B);
				System.out.println(A);
				
			}
		}
		
		scA.close();
		scB.close();
		scC.close();
		
	}
}
