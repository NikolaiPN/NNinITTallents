import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * Напишете програма, която първо чете 2 масива и после извежда
		 * съобщение дали са еднакви, и дали са с еднакъв размер.
		 * 
		 */
		
		int n1,n2; boolean isLengthEqual = true, isArrayEqual = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements are there going to be in the first array ?");
		n1 = sc.nextInt();
		
		System.out.println("How many elements are there going to be in the second array ?");
		n2 = sc.nextInt();
		
		int[] array1 = new int[n1];
		int[] array2 = new int[n2];
		
		for(int i = 0; i < array1.length; i++){
			System.out.println("This is the first array.Please enter value for element :" + i);
			array1[i] = sc.nextInt();
		}
		for(int i = 0; i < array2.length; i++){
			System.out.println("This is the second array.Please enter value for element :" + i);
			array2[i] = sc.nextInt();
		}
		
		if(n1 == n2){
		for(int i = 0,j = 0;i < array1.length && j < array2.length;i++,j++){
			if(array1[i] == array2[j]){
				isArrayEqual = true;
			}
			else{
				isArrayEqual = false;
				break;
			}
		}
		}
		else{
			isLengthEqual = false;
		}
		if(isArrayEqual == true && isLengthEqual == true){
			System.out.println("The lenght and elements in the two arrays are euqual");
		}
		else{
			System.out.println("Either the lenght or the elements in the two arrays are NOT euqual");
		}
		sc.close();
	}

}
