import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * По зададено число n, да се изведе на екрана таблица по
		 * следния начин:
		 * Въведете n:  Въведете n:      Въведете n:
		 * 1               2                 3 
		 * 0               11                222
		 *                 33                444
		 *                                   555 
		 */                

		
		int Num; int count = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		Num = sc.nextInt();
		
		// Row 1
		System.out.println(Num);
		
		// Row 2
		for(int row2 = 1; row2 <= Num; row2++){
			System.out.print(Num-1);
		}
		System.out.println();
		// Row 3 .... n
		for(int i = 2; i <= Num; i++){
			for(int pos = 1; pos <= Num; pos++){
				System.out.print(Num + count);	
			}
			count++;
			System.out.println();
		}
		
			
			
		sc.close();
	}

}
