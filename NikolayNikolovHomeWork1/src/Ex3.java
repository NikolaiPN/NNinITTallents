import java.util.Scanner;


public class Ex3 {
	public static void main(String[] args) {
		
		/* Въведете 2 различни числа от конзолата и разменете стойността им.
		 * Разпечатайте новите стойности
		 */
		
		/* 
		 * За да разменя стойностите на 2те променливи , ще използвам 3та променлива, която
		 * да съхрани стойността на едната променлива , докато тя приема стойността на втората.
		 * */
		
		int A; int B; int Temp;
		
		System.out.println("Please input value for A: ");
		
		Scanner scA = new Scanner(System.in);
		A = scA.nextInt();
		
		System.out.println("Please input value for B: ");
		
		Scanner scB = new Scanner(System.in);
		B = scB.nextInt();
		
		System.out.println("The value of A is: " + A + "  The value of B is: " + B);
		System.out.println("Now lets swap the values of the two variables :) ");
		
		Temp = A;
		A = B;
		B = Temp;
		
		System.out.println("Now the value of A is: " + A + "  And the value of B is: " + B);
		
		scA.close();
		scB.close();
		
		
	}

}
