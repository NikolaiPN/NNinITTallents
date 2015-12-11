import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * ��������� ������ �� ������ ������ ������ �� 4 � ����������
		 * ����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
		 * �� 1600 � 2000 �� ���������. ��������� ��������, ����� �� ������ ���,
		 * �����, ������ ��������� ���������� ����. ������ �����: ��� ����� ��
		 * ���, �����, ������
		 */
		
		byte d, m, mLength; short y; boolean leapY = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What day of the month is today?");
		d = sc.nextByte();
		System.out.println("In which month of the year are we ?");
		m = sc.nextByte();
		System.out.println("And finally what is the year");
		y = sc.nextShort();
		
		if( y % 400 == 0 || y % 4 == 0 ){
			leapY = true;
		}
		else {
			leapY = false;
		}
		if(m==1 ||m == 3 ||m==5 ||m==7 ||m==8 ||m==10 ||m==12){
			mLength = 31;
		}
		else if(m==4 ||m==6 || m==9 || m==1){
			mLength = 30;
		}
		else{
			if(leapY == true){
			mLength = 29;	
			}
			else 
			{
				mLength = 28;
			}
		}
		if((d+1) > mLength){
			if((m + 1) > 12){
				System.out.println("Tomorrow will be : 01/01/" + (y+1));
			}
			else {
				System.out.println("Tomorrow will be : 01/" + (m+1) + "/" + y);
			}
				
			}
		else{
			System.out.println("Tomorrow will be : " + (d+1) + "/" + m + "/" + y);
		}
		sc.close();

	}

}
