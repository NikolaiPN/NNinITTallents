import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която извежда всички естествени трицифрени
		 * числа, които имат сбор на цифрите равен на дадено число.
		 */
		int num, d1, d2, d3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number in the range 2-27");
		num = sc.nextInt();
		
		while(num <=1 || num >=28){
			System.out.println("You have entered a number out of the range.Pls try again");
			num = sc.nextInt();
		}
		for(int i = 100; i <= 999 ; i++){
			d3 = i % 10;
			d2 = (i/10)%10;
			d1 = ((i/10)/10)%10;
			if(d1 + d2 + d3 == num){
				System.out.println(i);
			}
		}
		sc.close();
	}

}
