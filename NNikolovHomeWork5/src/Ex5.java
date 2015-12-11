import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която се въвеждат 2 редици от знаци
		 * (думи).
		 * Ако в двете редици участва един и същи знак, да се изведе на екрана
		 * първата редица хоризонтално, а втората вертикално, така че да се
		 * пресичат в общия си знак.
		 * Ако редиците нямат общ знак да се изведе само уведомително
		 * съобщение.
		 * Пример :
		 * м
		 * а
		 * шапка
		 * и
		 * н
		 * а
		 */
		/*
		 * От примера се разбира,че трябва думите д се пресичат само ако сеъпада ннякой символ от първата дума с
		 * ПЪРВИЯ символ от втората, защото ако не беше така , трчбваше думите да се пресекът на първото 'а' от "машинка".
		 * За това ще направя програмата по същия начин.
		 */
		
		System.out.println("Enter two words divided by coma");
		
		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split(",");
		String word1 = split[0];
		String word2 = split[1];
		boolean done = false;
		
		for(int i = 0; i < word1.length();i++){
			if(word1.charAt(i) != word2.charAt(0)){
				System.out.println(word1.charAt(i));
			}else if(word1.charAt(i) == word2.charAt(0)){
				if(!done){
				System.out.println(word2);
				done = true;
				}
			}
		}
		sc.close();
	}

}
