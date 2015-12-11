import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * Въведено е трицифрено естествено число от вида abc. Трябва да се
		 * провери дали: ако a = b = c - Изход: цифрите са равни; ако a>b>c -
		 * Изход: цифрите са във възходящ ред; ако a<b<c цифрите са в низходящ
		 * ред; и изход: цифрите са ненаредени, за неописаните случаи. Да се
		 * състави програма, която извежда резултата от проверката за наредба на
		 * цифрите в числото. Пример: 345 Изход: възходящ ред.
		 */
		/*
		 * Тъй като има несъответствие в заданието и примера , ще направя програмата си по
		 * следния начин: ако a<b<c - цифрите са в възходяш ред, ако са a>b>c -
		 * в нисходящ ред.
		 */
		int num; int d1, d2, d3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number in the range of 100 to 999");
		num=sc.nextInt();
		
		while(num >=1000 && num<=99){
			num=sc.nextInt();
		}
		d3 = num % 10;
		d2 = (num/10) % 10;
		d1 = ((num / 10) / 10) % 10;
		
		if(d1 == d2 && d1 == d3){
			System.out.println("All of the digits are equal");
		}
		else if(d1 < d2 && d2 < d3){
			System.out.println("The digits are in asending order");
		}
		else if(d1 > d2 && d2 > d3){
			System.out.println("The digits are in descending order");			
		}
		else{
			System.out.println("The digits are not ordered");
		}
		sc.close();

	}

}
