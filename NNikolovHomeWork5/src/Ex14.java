
public class Ex14 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� �����, ����� ������ �� �������� ����� N � �����
		 * ���������� �� N! (N ���������)		 * 
		 */
		
		int n = 5;
		System.out.println(fact(n));
		

	}
	static int fact(int num){
		if( num <= 1){
			return 1;
		} else {
			return num * fact(num-1);
		}
		
	}

}
