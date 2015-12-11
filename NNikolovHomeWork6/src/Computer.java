
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDisckMemory;
	double freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOS){
		operationSystem = newOS;
	}
	
	void useMemory(double memory){
		if(memory < freeMemory){
			freeMemory -= memory;
		}
		else{
			System.out.println("Not enough memory");
		}
	}
	void printConfig(){
		System.out.println("OS : " + operationSystem);
		if(isNotebook){
			System.out.println("Notebook");
		}
		else{
			System.out.println("PC");
		}
		System.out.println("Year : " + year);
		System.out.println("HD Capacity : " + hardDisckMemory);
		System.out.println("Free virtual memory: " + freeMemory);
		System.out.println("Price : " + price);
	}
	
	

}
