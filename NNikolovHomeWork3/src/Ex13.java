import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която се въвежда число и се представя
		 * като число в двоична бройна система. Програмата, чрез масив, да
		 * изчислява последователно всички цифри на въведеното естествено число
		 * в 2-ична бройна система.		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int counter = 0;
		int[] arr = new int[32];
		
		System.out.println("Please enter a number in decimal");
		num = sc.nextInt();
		
		System.out.println("I will show you the number in binary");
		
		for(int i = 0;i < arr.length;i++){
			arr[i] = num % 2;
			num = num/2;
			if(num >= 1){
			counter++;
			}
		}
		for(int i = 0; i<= counter; i++){
			if (i == 0) {
				System.out.print("[" + arr[i] + " ");
			} else if (i == counter) {
				System.out.println(arr[i] + "]");
				break;
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
		
	}

}
