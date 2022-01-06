package chap01;

import java.util.Scanner;

public class Prac15 {

	static void triangleLB(int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) { //이거 아직 안 됐음,
		
		for(int i = n; i > n; i--) {
			for(int j = 0; j < n - i; j++) {
				System.out.print("  ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		//triangleLB(n);
		//triangleLU(n);
		triangleRU(n);
	}

}
