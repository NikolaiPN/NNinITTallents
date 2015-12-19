package people;

public class Employee extends Person {
	private double daySalary;
	
	public Employee(String name, int age, boolean isMale,double daySalary){
		super.name = name;
		super.age = age;
		super.isMale = isMale;
		this.daySalary = daySalary;
	}
	
	public double getSalary(){
		return daySalary;
	}
	
	public void setSalary(double salary){
		this.daySalary = salary;
	}
	
	public double calculateOvertime(int hours){
		if(this.age >= 18){
			return hours * ((this.daySalary / 8) * 1.5);
		} else {
			return 0;
		}
	}
	
	public void showEmployeeInfo(){
		this.showPersonInfo();
		System.out.println("Daily Salary : " + this.daySalary);
		
	}
	
	

}
