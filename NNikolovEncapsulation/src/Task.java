
public class Task {
	private String name;
	private int workingHours;
	
	
	// This is a task at work that has to be done.
	// Тъй като не разбрах какво точно значи да се зададат "валлидни стойности" на полетата , направих един конструктор
	// по подразбиране , който въвежда валидни стойности на полетата според мен, но направих и конструктор, които да изисква параметри за конструктора
	
	Task(){
		
	}
	
	Task(String name, int hours){
		this.name = name;
		this.workingHours = hours;
	}

	public String getName() {
		return name;
	}

	public int getWorkingHours() {
		return workingHours;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setWorkingHours(int hours){
		this.workingHours = hours;
	}
	

}
