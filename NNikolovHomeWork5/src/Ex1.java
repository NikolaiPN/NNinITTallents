import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която се въвеждат два низа съдържащи до
		 * 40 главни и малки букви. Като резултат на екрана да се извеждат
		 * низовете само с главни и само с малки букви. 
		 * Пример: Abcd Efgh 
		 * Изход: ABCD abcd EFGH efgh
		 */
		
		//User input for String 1
		
		System.out.println("Enter random staff and I will show it to you \n Capitalized and Not Capitalized. You have a limit : 40 symbols");
		Scanner sc = new Scanner(System.in);
		String random1 = sc.nextLine();
		
		//User input for String 2
		
		System.out.println("Enter random staff (Part II) and I will show it to you \n Capitalized and Not Capitalized. You have a limit : 40 symbols");
		String random2 = sc.nextLine();
		
		// testing if the length of the Strings is correct and if it is printing the strings in Upper and Lower formats 
		
		if(random1.length() > 40 || random2.length() > 40){
			System.out.println("One of the sentences you entered are too long. Try Again and remember 40 !! symbols INCLUDING spcaces");
		} else {
			System.out.print(random1.toUpperCase() + "   /////   ");
			System.out.println(random1.toLowerCase() + "       (" + random1.length() + ")" );
			
			System.out.print(random2.toUpperCase() + "   /////   ");
			System.out.println(random2.toLowerCase() + "       (" + random2.length() + ")" );			
			
		}
		sc.close();

	}

}
