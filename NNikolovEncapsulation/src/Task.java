
public class Task {
	private String name;
	private int workingHours;
	
	
	// This is a task at work that has to be done.
	// ��� ���� �� ������� ����� ����� ����� �� �� ������� "�������� ���������" �� �������� , �������� ���� �����������
	// �� ������������ , ����� ������� ������� ��������� �� �������� ������ ���, �� �������� � �����������, ����� �� ������� ��������� �� ������������
	
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
