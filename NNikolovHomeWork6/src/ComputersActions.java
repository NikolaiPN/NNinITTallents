import java.util.Scanner;

public class ComputersActions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PLease enter the new OS of Lisa :");
		String newOS = sc.nextLine();
		
		System.out.println("Enter the amount of memory you want to occupy from mac's ram :");
		double memoryTaken = sc.nextDouble();
		
		sc.close();
		
		// Creating the computer Lisa
		
		Computer lisa = new Computer(2011, 1212, 500000, 3000);
		
		//Creating the computer macintosh
		
		Computer mac = new Computer(2015, 2789.99, true, 1000000, 16000, "Win 10");
		
		//Creating the computer Chvor
		
		Computer chvor = new Computer();
		chvor.setPrice(1000);
				
		
		// Changing the operation system of lisa from IOS 2.0 to "user input"
		
		lisa.changeOperationSystem(newOS);
		
		// Using "user input" pieces of mac's memory
		
		mac.useMemory(memoryTaken);
				
		
		// Printing the configurations of Lisa And Mac after the changes
		
		System.out.println("Lisa's configurations after the OS upgrade : \n");

		lisa.printConfig();
		
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		System.out.println("Mac's config after occuping memory : \n");
		
		mac.printConfig();
		
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		System.out.println("Chvor's config after occuping memory : \n");
		
		chvor.printConfig();

		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		// Comparing Some prices
		
		System.out.println(mac.comparePrice(lisa));
		System.out.println(lisa.comparePrice(chvor));
		System.out.println(chvor.comparePrice(mac));
		System.out.println(chvor.comparePrice(lisa));
		System.out.println(mac.comparePrice(mac));


	}

}
