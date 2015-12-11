import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която се въвежда две числа от интервала
		 * [1..9]. Програмата да извежда таблицата за умножение. Максималната
		 * стойност на множителите е определена от 2-те числа. Пример: 2 2
		 * Изход: 1*1= 1; 1*2= 2; 2*1= 2; 2*2= 4; 
		 */
		
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers in the range 1-9");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		while(n1 <= 0 || n1 >= 9 || n2 <= 0 || n2 >= 9){
			System.out.println("Your input was incorrect.Please try again");
			System.out.println("Please enter 2 numbers in the range 1-9");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		
		for(int i = 1; i <= n1; i++){
			for(int j = 1; j <= n2; j++){
				System.out.println(i + " * " + j + " = " + i*j + ";");
			}
		}
		
		sc.close();

	}

}
