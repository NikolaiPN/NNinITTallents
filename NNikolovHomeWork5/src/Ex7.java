import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която чете набор от думи разделени с
		 * интервал.
		 * Като резултат да се извеждат броя на въведените думи, както и броя
		 * знаци в най-дългата дума.
		 * Пример: asd fg hjkl
		 * Изход: 3 думи, най-дългата е с 4 символа.
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
