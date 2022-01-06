package chap01;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~n sum: ");
		System.out.println("n: ");
		
		int n = scanner.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			
			sum += i;
			i++;
			System.out.println("n: " + n);
			System.out.println("i: " + i);
		}
		
		System.out.println("sum: " + sum);
	}

}
