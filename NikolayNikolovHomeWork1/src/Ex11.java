import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * Съставете програма, която по дадено трицифренo число проверява
		 * дали числото се дели на всяка своя цифра. Във въведеното число да
		 * няма цифра 0.
		 */
		
		int Num = 0; boolean IsItOk = true , CanItBeDivided = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number with 3 digits.");
		System.out.println("!Note that none of the digits can be 0!");
		Num = sc.nextInt();
		
		if(Num <= 99 && Num >= 1000){
			IsItOk = false;
		}
		else if(Num % (Num % 10) != 0) {
			CanItBeDivided = false;
			}
		else if(Num % ((Num/10)% 10) != 0){
			CanItBeDivided = false;
			} 
		else if(Num % ((Num/10)/10) != 0){
			CanItBeDivided = false;
			}
		if(IsItOk == false){
			System.out.println("Your number doesn't meet the requirements");
		} 
		else {
			if(CanItBeDivided == true){
				System.out.println("Your number can be divided by each of its digits");
			}
			else{
				System.out.println("Your number can NOT be divided by each of it's digits");
			}
		}
		sc.close();
	}

}

