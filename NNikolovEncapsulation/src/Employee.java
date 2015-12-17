
public class Employee {
	
	// An employee is part of the company and he has to do his part of the job on a current task 
	
	private String name;
	private Task currentTask;
	private int hoursLeft; // hourse left for today of employee's work day
	
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		while(name == null || name.equals("")){
			System.out.println("Please enter a valid name"); // Has to be non empty and not null
		}
		this.name = name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		while(currentTask == null || currentTask.equals("")){
			System.out.println("Please enter a valid current task"); // Has to be non empty and not null
		}
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		while(hoursLeft < 0){
			System.out.println("Please enter a positive number for hours"); // Has to be a positive number
		}
		this.hoursLeft = hoursLeft;
	}
	
	public void work(){
		if(this.currentTask.getWorkingHours() >= this.hoursLeft){
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft );
			this.hoursLeft = 0;
		} else {
			this.setHoursLeft(this.getHoursLeft() - this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(0);
		}
		this.showReport();
	}
	
	public void showReport(){
		System.out.println("After working on his task : ");
		System.out.println("The name of the employee is " + this.getName());
		System.out.println("The current task he's working on is " + this.currentTask.getName());
		System.out.println("This employee's hourse left for today : " + this.getHoursLeft());
		System.out.println("The required hours of work for the task to be complete : " + this.currentTask.getWorkingHours());
	}

}
