package chap02;

import java.util.Scanner;

public class Prac02 {
	
	static void swap(int[] arr, int x, int y) {
		
		int tmp;
		
		tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}

	static void reverse(int[] arr) {
		
		for(int i = 0; i < arr.length / 2; i++) {
			
			System.out.println("arr[" + i + "] and arr[" + (arr.length - i - 1) + "] reverse");
			
			swap(arr, i, arr.length - i - 1);
			
			for(int j = 0; j < arr.length; j++) {
				
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int num;
		num = scanner.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			System.out.println("input arr: ");
			arr[i] = scanner.nextInt();
		}
		
		reverse(arr);
		
		
	}

}
