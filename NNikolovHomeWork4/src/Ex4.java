
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Имате предварително въведени стойности на елементи в двумерен
		 * масив - естествени числа.
		 * Да се състави програма, чрез която се извеждат стойностите на
		 * елементите в двумерен масив след обръщането му на +90 градуса.
		 * Пример:
		 * 1,2,3,4
		 * 5,6,7,8
		 * 9,10,11,12
		 * 13,14,15,16
		 * Изход
		 * 13,9,5,1
		 * 14,10,6,2
		 * 15,11,7,3
		 * 16,12,8,4
		 */
		
		int[][] arr = {
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 4}
		};
		
		int[][] rotated = new int [arr.length][arr[0].length];
		
		for(int row = 0; row < arr.length; row++){
			for (int col = 0;col < arr[row].length;col++){
				rotated[row][col] = arr[arr.length-col - 1][row];
			}
		}
		for(int row = 0; row < rotated.length; row++) {
			for(int col = 0; col < rotated[row].length; col++)
				if(col == 0){
					System.out.print("[" + rotated[row][col]);
				}
				else if (col == rotated[row].length-1){
					
					if(row == rotated.length-1){
						System.out.println(", " + rotated[row][col] + "]");
					}
					else{
						System.out.println(", " + rotated[row][col] +"]" );
					}
				}
				else{
				System.out.print(", " + rotated[row][col]);
				}
		}		

	}

}
