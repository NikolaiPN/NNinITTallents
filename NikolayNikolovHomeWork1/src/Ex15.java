import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която въвежда естествено число от интервала
		 * [0..24]. Програмата да изведе съответстващо съобщение съобразно
		 * въведения час. Периодите са: [18..4] - Добър вечер; [4..9] - Добро
		 * утро; [9..18] - Добър ден Пример: 10 Изход: Добър ден
		 */
		/*
		 * Програмата казва добро утро ако часът е от 4 вкл. до 9 вкл. Добър ден ако е 
		 * след 9 или преди 18 вкл. Лека вечер ако е по-късно от 18 или по рано от 4.
		 */
		Byte hour;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the time (Write only the hour in 24h format)");
		hour = sc.nextByte();
		
		if(hour<=9 && hour>=4){
			System.out.println("Good Morning");
		}
		else if(hour<=18 && hour>9){
			System.out.println("Good Day");
		}
		else if(hour>18 || hour<4){
			System.out.println("Good Night");
		}
		sc.close();

	}

}
