import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		/*
		 * ������ � �������� ����� �����. ��������� �� ������ �� ����� �:
		 * 2,3,4,5,6,7,8,9,10, ����, ����, ���, ���. ��������� �� ���� ��
		 * ������� �: ������, ����, ����, ����. �� �� ������� ��������, ����
		 * ����� �� ������� N - ����� �� ��������� [1..51] � �� ��������
		 * ��������� ����� ����� � ���������� ��-������ ����� �� �������.
		 * ������: 47. �����: ��� ����, ��� ����, ��� ������, ��� ����, ���
		 * ����, ��� ����		 * 
		 */
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number in the range 1-51");
		n = sc.nextInt();
		
		for(int i = n; i<=52; i++){
			if(((i+ (4-(i%4)))/4)==0){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==1){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==2){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==3){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==4){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}	
			else if(((i+ (4-(i%4)))/4)==5){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}		
			else if(((i+ (4-(i%4)))/4)==6){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}			
			else if(((i+ (4-(i%4)))/4)==7){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}		
			else if(((i+ (4-(i%4)))/4)==8){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==9){
				System.out.print(((i/4)+2));
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==10){
				System.out.print("Jack ");
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==11){
				System.out.print("Queen ");
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==12){
				System.out.print("King ");
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
			else if(((i+ (4-(i%4)))/4)==13){
				System.out.print("Ace ");
				if(i % 4 == 0){
					System.out.println("spade");
				}
				else if(i % 4 == 1){
					System.out.println("club");
				}
				else if(i % 4 == 2){
					System.out.println("diamond");
				}
				else if(i % 4 == 3){
					System.out.println("heart");
				}
			}
		}
		sc.close();

	}

}
