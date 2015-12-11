
public class Ex6 {

	public static void main(String[] args) {
		/*
		 * Имате предварително въведени стойности от естествени числа.
		 * Числата са въведени в квадратна таблица с размери 6 реда и 6
		 * колони.
		 * Да се състави програма, чрез която се намира сумата на всички
		 * елементи от редовете с четни номера: 2,4 и 6.
		 * Програмата да извежда и сумата на всеки отделен ред.
		 * Пример:
		 * 11,12,13,14,15,16,
		 * 21,22,23,24,25,26,
		 * 31,32,33,34,35,36,
		 * 41,42,43,44,45,46,
		 * 51,52,53,54,55,56,
		 * 61,62,63,64,65,66
		 * Изход:
		 * 21,22,23,24,25,26 сума 141
		 * 41,42,43,44,45,46 сума 261
		 * 61,62,63,64,65,66 сума 381
		 * Сума на елементите 783
		 */
		
		int sum2 = 0;
		int sum4 = 0;
		int sum6 = 0;
		int sumRow = 0;
		int totalSum = 0;
		int[][] arr = {
				{1,2,3,4,5,6},
				{1,9,3,4,5,6},
				{1,2,3,4,5,6},
				{1,2,3,7,5,6},
				{1,2,3,4,5,6},
				{1,0,3,4,5,6},
		};
		int[][] arrSums = new int[3][6];
				
		
				for (int row = 1, i = 0; row < arr.length && i < arrSums.length; row+=2,  i++) {
					sumRow = 0;

					for (int col = 0; col < arr[row].length; col++) {
						arrSums[i][col] = arr[row][col];
						sumRow += arr[row][col];
					}
					switch(i){
					case 0:
						sum2 = sumRow;
						break;
					case 1:
						sum4 = sumRow;
						break;
					case 2:
						sum6 = sumRow;
						break;
					}
				}
				
				// Printing the result
				
				for(int row = 0; row < arrSums.length; row++ ){
					for(int col = 0; col < arrSums[row].length; col++){
						if (col == 0) {
							System.out.print("[" + arrSums[row][col]);
						} else if (col == arrSums[row].length - 1) {
							switch (row){
							case 0:
								System.out.println(", " + arrSums[row][col] + "] sum: " + sum2 );
								break;
							case 1:
								System.out.println(", " + arrSums[row][col] + "] sum: " + sum4);
								break;
							case 2:
								System.out.println(", " + arrSums[row][col] + "] sum: " + sum6 );
								break;
							}
						} else {
							System.out.print(", " + arrSums[row][col]);
						}
					}
				}
				totalSum = sum2 + sum4 + sum6;
				System.out.println("The result of the elements is : " + totalSum);

	}

}
