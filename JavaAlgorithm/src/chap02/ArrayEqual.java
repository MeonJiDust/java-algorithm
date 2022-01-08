package chap02;

import java.util.Scanner;

public class ArrayEqual {

	static boolean equals(int arr1[], int arr2[]) {
		
		if(arr1.length != arr2.length) return false;
		
		for(int i = 0; i < arr1.length; i++) {
			
			if(arr1[i] != arr2[i]) return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input A: ");
		int numA = scanner.nextInt();
		
		int arrA[] = new int[numA];
		
		for(int i = 0; i < numA; i++) {
			
			System.out.println("input arrA: ");
			arrA[i] = scanner.nextInt();
		}
		
		System.out.println("input B: ");
		int numB = scanner.nextInt();
		
		int arrB[] = new int[numB];
		
		for(int i = 0; i < numB; i++) {
			
			System.out.println("input arrB: ");
			arrB[i] = scanner.nextInt();
		}
		
		boolean isEquals = equals(arrA, arrB);
		
		if(isEquals == true) {
			System.out.println("true!");
		}else {
			System.out.println("False!");
		}
		
	}

}
