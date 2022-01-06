package chap01;

import java.util.Scanner;

public class Prac11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int num;
		int length;
		
		while(true) {
			
			num = scanner.nextInt();
			
			if(num < 0) {
				System.out.println("input 0 < !!");
			}else {
				break;
			}
		}
		
		length = (int)(Math.log10(num) + 1);
		
		System.out.println("length: " + length);
		
	}

}
