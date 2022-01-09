package chap02;

import java.util.Scanner;

public class CardConvRev {

	
	static int cardConvRev(int x, int r, char d[]) {
		
		int digits = 0;
		
		String dcharString = "012345678ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			
			d[digits++] = dcharString.charAt(x % r); // 기수로 나눈 나머지를 문자열 형태로 저장 
				//digits++는 일단d[0]에 값을 넣은 후 digits를 ++해준다.
			
			x /= r; // 값을 기수로 나눠 나머지 값을 x에 저장
			
		}while(x != 0);
		
		return digits;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int no, cd, dno, retry;
		char cno[] = new char[32];
		
		do {
			do {
				System.out.println("10진수 기수변롼: ");
				
				no = scanner.nextInt();
				
			}while(no < 0);
			
			do {
				System.out.println("진수 input: ");
				
				cd = scanner.nextInt();
				
			}while(cd < 2 || cd > 36);
			
			
			dno = cardConvRev(no, cd, cno);
			
			System.out.println("dno:" + dno);
			
			System.out.print(cd + "진수로는 ");
			
			for(int i = dno - 1; i >= 0; i--) {
				
				System.out.print(cno[i]);
			}
			
			System.out.println("입니다.");
			
			
			System.out.println("retry?? ");
			
			retry = scanner.nextInt();
			
		}while(retry == 1);


	}

}
