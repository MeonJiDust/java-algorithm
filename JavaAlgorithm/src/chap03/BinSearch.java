package chap03;

import java.util.Scanner;

public class BinSearch {

	static int binSearch(int a[], int n, int key) {
		
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			
			if(a[pc] == key) {
				
				return pc;
				
			}else if(a[pc] < key) {
				
				pl = pc + 1;
				
			}else {
				
				pr = pc - 1;
			}
		}while(pl <= pr);
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input: ");
		int num = scanner.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("오름차순 입력");
		
		System.out.println("arr[0] : ");
		arr[0] = scanner.nextInt();
		
		for(int i = 1; i < num; i++) {
			
			do {
				System.out.println("arr[" + i + "] : ");
				arr[i] = scanner.nextInt();
			}while(arr[i] < arr[i -1]);
		}
		
		System.out.println("key: ");
		int key = scanner.nextInt();
		
		int idx = binSearch(arr, num, key);
		
		if(idx == -1) {
			System.out.println("fail");
		}else {
			System.out.println(idx + "here!");
		}
	}

}
