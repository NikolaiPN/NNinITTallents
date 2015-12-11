import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a number and prints a triangle of
		 * stars with the height = number
		 */
		
		int Height; char star = '*';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number for the height of the triangle");
		Height = sc.nextInt();
		
		for(int row = 1; row<=Height; row ++){
			
			for(int empty = 1; empty <= Height - row ; empty++){
				
				System.out.print(" ");
			}
			for(int starCount = 1; starCount <= 2*row - 1; starCount++){
				
				System.out.print(star);
				
			}
			System.out.println();
		}
		sc.close();
	}

}
