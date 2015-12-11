import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		/*
		 * Едно число X е палиндром, aко се чете еднакво отпред назад и отзад
		 * напред. Да се състави програма, която проверява дали въведено число е
		 * палиндром. Входни данни: N - естествено число от интервала [10 ..
		 * 30000]. Пример: 17571 Изход: числото е палиндром Използвайте цикъл
		 * do-while.		 * 
		 */
		
		short x; boolean isPal = true;
		int d1,d2,d3,d4,d5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a number in the range 10-30000");
		x = sc.nextShort();
		
		if(x<=999 && x >=100){
			d3 = x % 10;
			d2 = (x/10)%10;
			d1 = ((x/10));
			
		}


	}

}
