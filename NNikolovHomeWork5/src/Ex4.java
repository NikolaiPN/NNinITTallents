import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, чрез която по въведени трите имена на двама
		 * човека разделени със запетая, се извежда чие име има по-голям сбор
		 * от ASCII кодовете на съставящите името букви.
		 * Пример: Anna Dosewa Asenowa, Iwo Peew Peew
		 * Изход: Anna Dosewa Asenowa
		 */
		
		System.out.println("Enter 2 full names ( Persinal/Fathers and Family ) divided by coma");
		
		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split(",");
		String name1 = split[0];
		String name2 = split[1];
		int name1Res = 0;
		int name2Res = 0;
		
		for(int i = 0; i < name1.length(); i++){
			name1Res = (int)name1.charAt(i);
		}
		for(int i = 0; i < name2.length(); i++){
			name2Res = (int)name2.charAt(i);
		}
		
		if(name1Res > name2Res){
			System.out.println(name1);
		} else if(name1Res < name2Res) {
			System.out.println(name2);
		} else{
			System.out.println("The 2 names are exactly the same");
			System.out.println(name1);
		}
		sc.close();
	}

}
