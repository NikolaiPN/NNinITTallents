import java.util.Scanner;


public class Ex7 {

	public static void main(String[] args) {
		
		/*
		 * Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
		 * пари (число с плаваща запетая), дали съм здрав – булев тип. Съставете
		 * програма, която взема решения на базата на тези данни по следния
		 * начин: - ако съм болен, няма да излизам - ако имам пари, ще си купя
		 * лекарства - ако нямам – ще стоя вкъщи и ще пия чай - ако съм здрав,
		 * ще отида на кино с приятели - ако имам по-малко от 10 лв, ще отида на
		 * кафе. Полученото решение покажете като съобщение в конзолата.
		 */
		/*
		 * Не разбрах каква е ролята на часа и особенно от целочислен тип, но все 
		 * пак го имам като променлива , въпреки че не съм я използвал.
		 */

		byte Haur; double Money; boolean AmIHealty;
		System.out.println("Please input Hour, Money and true/false for being Healty/Sick :");
		
		Scanner H = new Scanner(System.in);
		Haur = H.nextByte();
		
		Scanner M = new Scanner(System.in);
		Money = M.nextDouble();
		
		Scanner AIH = new Scanner(System.in);
		AmIHealty = AIH.nextBoolean();
		
		if(AmIHealty == false){
			
			if(Money > 60){
				
				System.out.println("I will buy drugs and stay home");
			
			} else {
				
				System.out.println("I will stay home and dring tea");
			
			}
				
		} else {
			
			if(Money >= 10){
				
				System.out.println("I will go to the cinema with my friends");
				
			} else {
				
				System.out.println("I will go to the Caffee with my friends");
			
			}
			
		}
		
		H.close();
		M.close();
		AIH.close();
		
	}

}
