package chap02;

import java.util.Scanner;

public class ReverseArray {

	static void swap(int[] a, int idx1, int idx2) {
		
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	static void reverse(int[] a) {
		
		for(int i = 0; i < a.length / 2; i++) {
			
			swap(a, i, a.length - i - 1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input: ");
		int num = scanner.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("input arr: ");
			arr[i] = scanner.nextInt();
		}
		
		reverse(arr);
		
		System.out.println("reverse result: ");
		
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
	}

}
