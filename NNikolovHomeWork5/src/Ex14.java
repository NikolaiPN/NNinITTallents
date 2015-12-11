
public class Ex14 {

	public static void main(String[] args) {
		/*
		 * Да се състави метод, който приема за стойност число N и връща
		 * стойността на N! (N факториел)		 * 
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
