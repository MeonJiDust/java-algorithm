package chap01;

import java.util.Scanner;

public class Max3 {

	//3개의 정숫값을 입력하고최댓값을 구함.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구함: ");
		System.out.println("a: ");
		int a = scanner.nextInt();
		System.out.println("b: ");
		int b = scanner.nextInt();
		System.out.println("c: ");
		int c = scanner.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		System.out.println("최댓값은 " + max);
		

	}

}
