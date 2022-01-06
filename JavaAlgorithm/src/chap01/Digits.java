package chap01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int no;
		
		System.out.println("2 length num: ");
		
		do {
			System.out.println("input: ");
			no = scanner.nextInt();
			
		}while(no < 10 || no > 90);
		
		System.out.println(no);
	}

}
