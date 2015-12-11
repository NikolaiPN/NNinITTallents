import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и 3
		 * литра и ги ползвате едновременно. Да се състави програма, която по
		 * даден обем извежда как ще прелеете течността с тези кофи, т.е.
		 * по-колко пъти ще се пълни всяка от кофите. Кофите не могат да се
		 * ползват с частично количество вода. Входни данни: естествено число от
		 * интервала [10..9999].
		 * 
		 */
		
		int Volume;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please input the water volume you want to pour");
		Volume = sc.nextInt();
		
		if(Volume % 5 == 0){
			System.out.println("To fill the volume we need : \n" + Volume/5 + "small buckets and " + Volume/5 + "big buckets" );
			
		}
		else if(Volume % 5 == 1){
			System.out.println("To fill the volume we need : \n" + ((Volume /5) - 1) + " small buckets and " + ((Volume/5) + 1) + " big buckets");
		}
		else if(Volume % 5 == 2){
			System.out.println("To fill the volume we need : \n" + ((Volume /5) + 1) + " small buckets and " + Volume/5 + " big buckets");
		}
		else if(Volume % 5 == 3){
			System.out.println("To fill the volume we need : \n" + Volume /5 + " small buckets and " + ((Volume/5) + 1) + " big buckets");
		}
		else if(Volume% 5 == 4){
			System.out.println("To fill the volume we need : \n" + ((Volume /5) + 2) + " small buckets and " + Volume/5 + " big buckets");
		}
		sc.close();
		

	}

}
