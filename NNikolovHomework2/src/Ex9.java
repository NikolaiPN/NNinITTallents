import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		/*
		 * Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички
		 * числа от А до В на степен 2(разделени с запетая).Ако някое число е
		 * кратно на 3, да се изведе съобщение че числото се пропуска „skip
		 * 3“.Ако сумата от всички изведени числа (без пропуснатите) стане
		 * по-голяма от 200, да се прекрати извеждането.
		 */
		
		/* Не разбрах дали трябва да пропускаме веведените от потребителя числа (в моя случай num) кратни на 3
		 * или числата повдигнати на степен (i*i) кратни на 3 и за това ще ми изписва
		 * skip 3 на вече повдигнати на степен исла, които са кратни на 3
		 */
		 
		
		int num1, num2, sum=0, lowerNum=0, higherNum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if( num1 < num2 ){
			lowerNum = num1;
			higherNum = num2;
		}
		else{
			lowerNum = num2;
			higherNum = num1;
		}
		System.out.print(lowerNum*lowerNum);
		for(int i = lowerNum + 1 ;sum +(i*i) <= 200 && i <= higherNum ; i++){
			if((i*i) % 3 != 0){
				System.out.print(", " + i*i );
				sum+=(i*i);
			}
			else{
				System.out.print(", skip 3");
			
			}
		}
		System.out.println();
		System.out.println(" The sum is : " + sum);
		sc.close();
	}

}
