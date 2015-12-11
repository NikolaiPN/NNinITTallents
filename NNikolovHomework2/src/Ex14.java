import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която по въведено естествено число N от
		 * интервала [10..200] извежда в обратен ред всички числа, които са
		 * кратни на 7 и са по-малки от N.
		 * 
		 */
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number in the range 10-200");
		num = sc.nextInt();
		
		while(num<=9 || num >=201){
			System.out.println("The number you have entered is out of range.Please try again");
			num = sc.nextInt();
		}
		for(int i = num; i >= 1; i--){
			if(i % 7 == 0){
				System.out.println(i);
			}
		}
		sc.close();

	}

}
