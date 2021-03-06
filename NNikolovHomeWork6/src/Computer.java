
public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDisckMemory;
	private double freeMemory;
	private String operationSystem;

	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDisckMemory = hardDiskMemory;
		this.freeMemory = freeMemory;

	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDisckMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;

	}

	void changeOperationSystem(String newOS) {
		operationSystem = newOS;
	}
	
	void setPrice(double price){
		this.price = price;
	}
	
	void sethardDiscMemory(double memory){
		this.hardDisckMemory = memory;
	}
	
	void setFreeMemory(double freemem){
		this.freeMemory = freemem;
	}

	void useMemory(double memory) {
		if (memory < freeMemory) {
			freeMemory -= memory;
		} else {
			System.out.println("Not enough memory");
		}
	}

	void printConfig() {
		System.out.println("OS : " + operationSystem);
		if (isNotebook) {
			System.out.println("Notebook");
		} else {
			System.out.println("PC");
		}
		System.out.println("Year : " + year);
		System.out.println("HD Capacity : " + hardDisckMemory);
		System.out.println("Free virtual memory: " + freeMemory);
		System.out.println("Price : " + price);
	}
	
	/*
	int comparePrices(Computer other){
		if(this.price > other.price){
			return -1;
		}
		else if(this.price == other.price){
			return 0;
		}
		else{
			return 1;
		}
	}
	*/
	
	String comparePrice(Computer other){
		if(this.price > other.price){
			return "The computer you're comparing is more expensive\n";
		}
		else if(this.price == other.price){
			return "Both computers have the same price\n";
		}
		else{
			return "The computer you're comparing is cheaper\n";
		}
	}

}
