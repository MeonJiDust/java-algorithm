package chap01;

import java.util.Scanner;

public class Prac10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int a, b;

		while(true) {
			
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			if(a > b) {
				System.out.println("input b > a!!");
				
			}else {
				break;
			}
		}
		
		System.out.println(b - a);
	}

}
