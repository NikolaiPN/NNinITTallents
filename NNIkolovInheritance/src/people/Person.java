package people;

public class Person {
	protected String name;
	protected int age;
	protected boolean isMale;
	
	Person(){
		
	}
	
	public Person(String name, int age, boolean isMale){
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void showPersonInfo(){
		System.out.println();
		System.out.println("Info about");
		System.out.println(this.name);
		System.out.println(this.age + " years old");
		if(this.isMale){
			System.out.println("Male");
		}
		else {
			System.out.println("Woman");
		}
	}

	

}
