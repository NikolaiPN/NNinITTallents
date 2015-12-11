import java.util.Scanner;


public class Ex2 {
	public static void main(String[] args) {
		
		/*
		 * Въведете 2 различни целочислени числа от конзолата. Запишете тяхната
		 * сума, разлика, произведение, остатък от деление и целочислено деление
		 * в отделни променливи и разпечатайте тези резултати в конзолата.
		 * Опитайте същото с числа с плаваща запетая.
		 */
		
		/* 
		 * В променливите А и В запазваме стойностите въведени в скенерите. В Sum записваме 
		 * сумата на числата; В Dif записваме разликата; В Mult записваме произведението;
		 * В Mod записваме резултата от остатъчното деление и в Div записваме резултата от цело-
		 * численото деление
		 */
		
		int A; int B; int Sum; int Dif; int Prod; int Mod; int Div;
		
		System.out.println("Please input value for A: ");
		
		Scanner scA = new Scanner(System.in);
		A = scA.nextInt();
		
		System.out.println("Please input value for B: ");
		
		Scanner scB = new Scanner(System.in);
		B = scB.nextInt();
		
		Sum = A + B;
		Dif = A - B;
		Prod = A * B;
		Mod = A % B;
		Div = A / B;
		
		System.out.println("The Sum of the 2 numbers you entered is: " + Sum );
		System.out.println("The Difference between the 2 numbers you entered is: " + Dif );
		System.out.println("The Product of the 2 numbers you entered is: " + Prod );
		System.out.println("The Modulus of the 2 numbers you entered is: " + Mod );
		System.out.println("The Division of the 2 numbers you entered is: " + Div );
		
		scA.close();
		scB.close();
		
		
		
	}

}
