import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която да изчисли сумата на всички числа от 1
		 * до въведено число N.
		 */
		int n, sum = 0 , start = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		n = sc.nextInt();
		
		do{
			sum += start;
			start++;
		} 
		while(start <= n);
		System.out.println(sum);
		sc.close();
	}

}
