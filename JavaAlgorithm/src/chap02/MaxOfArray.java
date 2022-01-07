package chap02;

import java.util.Scanner;

public class MaxOfArray {
	
	static int maxOf(int[] a) {
		
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			
			if(a[i] > max)
				max = a[i];
			
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input:");
		
		int num = scanner.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			System.out.print("height[" + i + "]");
			height[i] = scanner.nextInt();
		}
		
		System.out.println(maxOf(height));
	}

}
