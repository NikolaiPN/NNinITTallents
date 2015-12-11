import java.util.Scanner;

public class ComputersActions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PLease enter the new OS of Lisa :");
		String newOS = sc.nextLine();
		
		System.out.println("Enter the amount of memory you want to occupy from mac's ram :");
		double memoryTaken = sc.nextDouble();
		
		// Creating the computer Lisa
		
		Computer lisa = new Computer();
		lisa.freeMemory = 500;
		lisa.hardDisckMemory = 50000;
		lisa.isNotebook = true;
		lisa.operationSystem = "IOS 2.0";
		lisa.price = 1234.50;
		lisa.year = 2013;
		
		//Creating the computer macintosh
		
		Computer mac = new Computer();
		mac.freeMemory = 650;
		mac.hardDisckMemory = 100000;
		mac.isNotebook = false;
		mac.operationSystem = "IOS 3.0";
		mac.price = 2100;
		mac.year = 2015;
		
		// Changing the operation system of lisa from IOS 2.0 to "user input"
		
		lisa.changeOperationSystem(newOS);

		// Using "user input" pieces of mac's memory
		
		mac.useMemory(memoryTaken);
		
		// Printing the configurations of Lisa And Mac after the changes
		
		System.out.println("Lisa's configurations after the OS upgrade :");
		lisa.printConfig();
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Mac's config after occuping memory : ");
		mac.printConfig();

		System.out.println("Just to test GitHub");
		
		sc.close();

	}

}
