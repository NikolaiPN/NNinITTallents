import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		
		/*
		 * Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
		 * им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
		 * а3 да има старата стойност на а1.
		 */
		/*
		 * За изпълнението на тази задача също ще използваме допълнителна променлива,
		 * която да съхранява стойността на А по време на размяната на стойностите.
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
