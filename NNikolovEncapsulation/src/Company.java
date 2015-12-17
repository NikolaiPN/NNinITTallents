
public class Company {

	public static void main(String[] args) {
		
		// Setting some task for the employees
		
		Task job1 = new Task("Do this thing", 14);
		Task job2 = new Task();
		job2.setName("Do some booty dance");
		job2.setWorkingHours(4);
		Task job3 = new Task("Go get yeled by your boss", 2);
		
		// Hiring some employees to get those task done
		
		Employee joro = new Employee("Georgi Georgiev");
		joro.setHoursLeft(5);
		joro.setCurrentTask(job2);
		
		Employee dancho = new Employee("Iordan Ivanov");
		dancho.setHoursLeft(7);
		dancho.setCurrentTask(job1);
		
		Employee niki = new Employee("Nikolai Zorov");
		niki.setHoursLeft(5);
		niki.setCurrentTask(job1);
		
		Employee angel = new Employee("Angel Ivanov");
		angel.setHoursLeft(6);
		angel.setCurrentTask(job3);
		
		// Using some methods of Employee
		
		System.out.println("Joro's info in the begining of the day is :");
		joro.showReport();
		System.out.println();
		
		System.out.println("And dancho's info in the begining of the day is :");
		dancho.showReport();
		System.out.println();
		
		joro.work();
		System.out.println();
		angel.work();
		System.out.println();
		niki.work();
		System.out.println();
		dancho.work();
		
	}

}
