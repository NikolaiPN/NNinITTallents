package action;

import people.Person;
import people.Employee;
import people.Student;;

public class Actions {

	public static void main(String[] args) {
		Person[] group = new Person[10];
		Person valio = new Person("Valentin", 18, true);
		Person geri = new Person("Gergana", 20, false);
		Student kris = new Student("Kristian", 16, true, 4);
		Student zoro = new Student("Zorovski", 21, true, 6);
		Employee dido = new Employee("Deqn", 19, true, 60);
		Employee iva = new Employee("Ivelina", 17, false, 85);

		group[0] = valio;
		group[1] = geri;
		group[2] = kris;
		group[3] = zoro;
		group[4] = dido;
		group[5] = iva;

		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				if (group[i].getClass().equals(Person.class)) {
					group[i].showPersonInfo();
				} else if (group[i].getClass().equals(Student.class)) {
					((Student) group[i]).showStudentInfo();
				} else {
					((Employee) group[i]).showEmployeeInfo();
					System.out.println("The overtime payment must be : " + ((Employee) group[i]).calculateOvertime(2));
				}
				
			}
		}

	}

}
