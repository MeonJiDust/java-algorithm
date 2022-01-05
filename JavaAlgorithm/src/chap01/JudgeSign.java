package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input: ");
		
		int n = scanner.nextInt();
		
		if(n > 0) {
			System.out.println("양");
		}else if(n < 0) {
			System.out.println("음");
		}else {
			System.out.println("0");
		}
		
		scanner.close();
	}

}
