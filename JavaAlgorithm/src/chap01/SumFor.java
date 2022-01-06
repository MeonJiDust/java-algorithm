package chap01;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~n sum: ");
		System.out.println("n: ");
		int n = scanner.nextInt();
		
		int sum = 0; for(int i = 1; i < n; i++) {
			
			sum += i;
		}
		
		System.out.println("sum: " + sum);
	}

}
