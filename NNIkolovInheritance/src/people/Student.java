package people;

public class Student extends Person {
	protected double score;
	
	public Student(String name, int age, boolean isMale, double score){
		super.name = name;
		super.age = age;
		super.isMale = isMale;
		if(score < 2 || score > 6){
			System.out.println("You have entered invalid score. Score must be in the range 2-6");
		}
		else{
		this.score = score;
		}
	}
	
	public void showStudentInfo(){
		this.showPersonInfo();
		System.out.println("Score : " + this.score);
	}
}
