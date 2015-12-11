import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която чете от конзолата 2 естествени
		 * двуцифрени числа a,b. Програмата да изведе в конзолата дали
		 * последната цифра от произведението на двете числа е четна, както и
		 * самата цифра. Входни данни: a,b - естествени числа от интервала
		 * [10..99].
		 * 
		 */
		
		int n1 , n2 , result , LastDigit;
		
		System.out.println("Please enter 2 numbers in the range of 10 to 99");
		
		Scanner sc1 = new Scanner(System.in);
		n1 = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		n2 = sc2.nextInt();
		
		// Знам,че не може да се използва while цикъл в тази задача , но не се сетих друг
		// вариант как да направя програмата да иска правилния тип информация да бъде въведена
		while (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99){
			System.out.println("You have entered incorrect numbers. Try again");
			n1 = sc1.nextInt();
			n2 = sc2.nextInt();
			
		}
		
		result = n1 * n2;
		LastDigit = result % 10;
		System.out.println("The product of the numbers is : " + result);
		
		if (LastDigit % 2 == 0){
			System.out.println("The last digit of the product of the 2 numbers is even");
			System.out.println(LastDigit);
		} 
		else {
			System.out.println("The last digit of the product of the 2 numbers is odd");
			System.out.println(LastDigit);
		}
		
		sc1.close();
		sc2.close();
		
		

	}

}
