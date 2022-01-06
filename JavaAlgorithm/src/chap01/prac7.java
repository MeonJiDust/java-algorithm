package chap01;

import java.util.Scanner;

public class prac7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
			
			if(i == n) {
				System.out.print(i + " = " + sum);
			}else {
				
				System.out.print(i + " + ");
			}
		}
	}

}
