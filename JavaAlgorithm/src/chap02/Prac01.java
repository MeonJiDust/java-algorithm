package chap02;

import java.util.Random;
import java.util.Scanner;

public class Prac01 {

	static int maxOf(int[] a) {
		
		int max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int num = random.nextInt(10);
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			height[i] = 100 + random.nextInt(90);
		}
		
		System.out.println("num: " + num);
		
		for(int i = 0; i < num; i++) {
			
			System.out.println(height[i]);
		}
		
		System.out.println("max: " + maxOf(height));
	}

}
