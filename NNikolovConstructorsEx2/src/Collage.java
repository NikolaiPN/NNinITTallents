
public class Collage {
	public static void main(String[] ags) {

		// Creating some students and collage groups and preparing for the
		// beginning of the year

		Student ivan = new Student("Ivan Ivaniv", "software engineering", 19);
		Student sasho = new Student("Aleksandur Minchev", "software engineering", 20);
		Student dimo = new Student();
		Student geri = new Student("Gergana Daskalova", "Psychology", 22);
		geri.grade = 5.75;
		Student mimi = new Student("Maria Angelova", "Gymnastics", 20);
		mimi.grade = 5;
		Student diego = new Student();

		StudentGroup gymnastics = new StudentGroup("Gymnastics");
		StudentGroup preparational = new StudentGroup();
		StudentGroup psycho = new StudentGroup("Psychology");
		StudentGroup it = new StudentGroup("Software engineering");

		// Now we must put the students in some groups

		gymnastics.addStudent(mimi);
		gymnastics.addStudent(diego);
		preparational.addStudent(dimo);
		preparational.addStudent(diego);
		preparational.addStudent(ivan);
		it.addStudent(sasho);
		it.addStudent(ivan);
		psycho.addStudent(geri);
		psycho.addStudent(mimi);

		// taking info about some students and groups

		geri.printStudentInfo();
		System.out.println();
		ivan.printStudentInfo();
		System.out.println();
		mimi.printStudentInfo();
		System.out.println();
		dimo.printStudentInfo();
		System.out.println();
		psycho.printGroupInfo();
		gymnastics.printGroupInfo();
		it.printGroupInfo();
		preparational.printGroupInfo();

		// Sending some students to nextYear due to admin mistake

		geri.upYear();
		ivan.upYear();
		diego.upYear();
		geri.upYear();
		geri.upYear();

		// Making one studen rich

		sasho.recieveScholarship(500, 5);
		geri.recieveScholarship(1200, 5.50);

		// The best students in the groups

		System.out.println(gymnastics.theBestStudent());
		System.out.println(psycho.theBestStudent());
		System.out.println(it.theBestStudent());
		System.out.println(preparational.theBestStudent());
	}

	static void addStudent() {

	}

}
