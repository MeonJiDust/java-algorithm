package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		System.out.println("1~n sum: ");
		
		do { //양수만 입력하도록 하기 위한 루프문
			
			System.out.println("n: ");
			n = scanner.nextInt();
			
		}while(n <= 0);
		
		for(int i = 0; i <= n; i++) {
			
			sum += i;
		}
		
		System.out.println("sum: " + sum);
	}

}
