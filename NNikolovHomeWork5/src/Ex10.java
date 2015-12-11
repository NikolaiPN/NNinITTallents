import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която по даден низ връща друг, символите, на
		 * който са получени като към всеки код на символ от ASCII таблицата е
		 * добавеното числото 5 и е записан новополучения символ. Пример :
		 * Вход: Hello 
		 * Изход:Mjqqt
		 */

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder inputFinal = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			int temp = (int) input.charAt(i);
			inputFinal.append((char) (temp + 5));

		}
		System.out.println(inputFinal);
		sc.close();

	}

}
