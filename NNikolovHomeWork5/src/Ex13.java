import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/*
		 * Да се създаде метод, който приема два масива от числа и връща масив,
		 * съдържащ всички елементи на подадените масиви, като в първата част на
		 * масива са елементите на първия подаден масив, а във втората част –
		 * тези на втория подаден масив.
		 */
		
		System.out.println("How many numbers will there be in the first array");
		Scanner sc = new Scanner(System.in);
		int length1 = sc.nextInt();
		
		System.out.println("How many numbers will there be in the second array");
		int length2 = sc.nextInt();
		
		int[] arr1 = new int[length1];
		int[] arr2 = new int[length2];
		
		System.out.println("Enter elements in the first array");
		
		for(int i = 0; i < length1; i ++){
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter elements in the second array");
		
		for(int i = 0; i < length2; i ++){
			arr2[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(combiningArrays(arr1,arr2)));
		sc.close();
		
		
	}
	static int[] combiningArrays(int[] masiv,int[] masiv2){
		int[] combArray = new int[masiv.length + masiv2.length];
		for(int i = 0; i < combArray.length; i++){
			if(i < masiv.length){
				combArray[i] = masiv[i];
			} else {
				combArray[i] = masiv2[i - masiv.length];
			}
		}
		return combArray;
	}
	

}
