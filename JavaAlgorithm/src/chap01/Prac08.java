package chap01;

import java.util.Scanner;

public class Prac08 {
	
	static int sumof(int a, int b) {
		
		int sum = 0;
		
		if(a > b) {
			
			for(int i = a; i >= b; i--) {
				
				sum += i;
			}
			return sum;
			
		}else if(b > a) {
			
			for(int i = b; i >= a; i--) {
				
				sum += i;
			}
			
			return sum;
			
		}else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		int sum;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		sum = sumof(a, b);
		
		System.out.println(sum);
		
		scanner.close();
	}

}
