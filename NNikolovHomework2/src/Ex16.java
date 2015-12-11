import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която се въвеждат 2 естествени числа N,
		 * M от интервала [10..5555]. Програмата, чрез цикъл for, да извежда
		 * всички числа от интервала, които са кратни на 50 в низходящ ред.
		 * Пример: 25,249 Изход: 200,150,100, 50.
		 */
		
		int n, m, lnum, hnum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers in the range 10-5555");
		n = sc.nextInt();
		m = sc.nextInt();
		
		while(n <= 9 || n >= 5556 || m <= 9 || m >= 5556 ){
			System.out.println("You have entered incorrect numbers.Please try again");
			System.out.println("Please enter 2 numbers in the range 10-5555");
			n = sc.nextInt();
			m = sc.nextInt();
		}
		
		if(n < m){
			lnum = n;
			hnum = m;
		}
		else{
			lnum = m;
			hnum = n;
		}
		for(int i = hnum; i >= lnum; i--){
			if(i % 50 == 0){
				System.out.println(i);
			}
			sc.close();
		}

	}

}
