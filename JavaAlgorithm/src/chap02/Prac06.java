package chap02;

import java.util.Scanner;

public class Prac06 {

	static int convert(int x, int y, char arr[]) { //어렵당.. 
		
		int digits = 0;
		int result = x;
		
		while(true) {
			
			if(result != 0) {
				
				digits++;
				System.out.println("digits: " + digits);
				result /= y;
			}else {
				break;
			}
		}
		
		int digit = digits;
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			
			arr[--digits] = dchar.charAt(x % y);
			
			System.out.println(arr[digits]);
			x /= y;
			
		}while(x != 0);

		
		return digit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int num;
		int digit;
		int dnum;
		int retry;
		char arr[] = new char[32];
		
		do {
			
			do {
				
				System.out.println("input num: ");
				num = scanner.nextInt();
				
			}while(num < 0);
			
			do {
				
				System.out.println("input digit: ");
				digit = scanner.nextInt();
				
			}while(digit < 2 || digit > 36);
			
			
			dnum = convert(num, digit, arr);
			
			System.out.println("dnum: " + dnum);
			
			System.out.print(digit + "진수로는 ");
			
			for(int i = 0; i < dnum; i++) {
			
				System.out.print(arr[i]);
			}
			
			System.out.println("입니다.");
			
			System.out.println("retry? ");
			retry = scanner.nextInt();
			
		}while(retry == 1);
		
	}

}
