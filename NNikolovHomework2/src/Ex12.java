
public class Ex12 {

	public static void main(String[] args) {
		/*
		 * Да се състави програма, която извежда всички естествени трицифрени
		 * числа, които нямат еднакви цифри т.е. 100,101, 606 и т.н. не се
		 * извеждат.
		 */
		int d1, d2, d3;
		
		System.out.println("I will show you the numbers in the range of 100-999 that does not contain 2 digits that are the same");
		
		System.out.print(102);
		for(int i = 103; i <= 999; i++){
			d3 = i % 10;
			d2 = (i/10)%10;
			d1 = ((i/10)/10)%10;
			if(d1 == d2 || d1 == d3 || d2 == d3){
				
			}
			else{
				System.out.print(", " + i);
			}
		}

	}

}
