import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * �� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
		 * ��������.
		 * ���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
		 * ����� � ���-������� ����.
		 * ������: asd fg hjkl
		 * �����: 3 ����, ���-������� � � 4 �������.
		 */
		
		System.out.println("Enter a sentance");
		
		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split("\\s");
		int max = 0;
		
		
		for(int word = 0; word < split.length; word++){
			int count = 0;
			for(int i = 0; i < split[word].length(); i++){
				count++;
		}
			if(max < count){
				max = count;
			}
		}
		System.out.println(split.length + " words, the longest word has " + max + " symbols");
		sc.close();
	}

}
