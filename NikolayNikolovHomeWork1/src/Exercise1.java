import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		/*
		 * Да се изведат съобщения към потребителя и да се прочетат 2 числа от
		 * клавиатурата A и B (може да са с плаваща запетая – double). После да
		 * се прочете 3-то число C и да се провери дали то е м/у A и B. Да се
		 * изведе подходящо съобщение за това дали C е между A и B.
		 */
		/* Тъй като не разбрах дали трябва да имаме различни съобщение към потребителя за 
		 * ситуациите ,в които expression - а е False съм направил само един вариант с един If
		 * statement с по 1 възможност за true и една за false 
		 */
	
		double A;double B; double C;
				
		System.out.println("Please input value for A: ");
		
		Scanner scA = new Scanner(System.in);
		A = scA.nextDouble();
		
		System.out.println("Please input value for B: ");
		
		Scanner scB = new Scanner(System.in);
		B = scB.nextDouble();
		
		System.out.println("So far, so good. Now please enter value for C: ");
		
		Scanner scC = new Scanner(System.in);
		C = scC.nextDouble();

		if(A < C && C < B){
			
			System.out.println("The Value of C is between the values of A and B");
			
		} else if(B < C && C < A){
			
			System.out.println("The Value of C is between the values of A and B");
		
		}else{
			System.out.println("The value of C is not between the values of A and B");
		}
		
		
		scA.close();
		scB.close();
		scC.close();
			
		}
			
	}