import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която по въведено естествено число от
		 * интервала [10..99] се извежда поредица числа, при спазване на
		 * следните изисквания: 1) ако предходното число е четно се извежда
		 * 0.5*числото; 2) ако предходното число е нечетно се извежда 3*числото
		 * +1. Извеждането продължава докато не се получи стойност 1. Пример: 11
		 * Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.		 * 
		 */
		
		double n , res , half = 0.5, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		n = sc.nextInt();

		while(n <= 9 || n >= 100){
			System.out.println("You have entered incorrect numbers. PLease try again");
			System.out.println("Please enter a number");
			n = sc.nextInt();
		}
		res = n;
		temp = res;
		
		while(res != 1){
			if(res % 2 == 0){
				res = temp * half;
				System.out.print(res + ", ");

			}
			else {
				res = (3 * temp) +1;
				System.out.print(res + ", ");
				
			}
			temp = res;
		}
		sc.close();

	}

}
