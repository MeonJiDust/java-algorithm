package chap03;

import java.util.Scanner;

public class SeqSearch {
	
	static int seqSearch(int a[], int n, int key) {
		
		int i = 0;
		
		while(true) {
			
			if(i == n) {
				return -1;
			}
			if(a[i] == key) {
				return i;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input: ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("key: ");
		int key = sc.nextInt();
		
		int idx = seqSearch(arr, num, key);
		
		if(idx == -1) {
			System.out.println("-1");
		}else {
			System.out.println(arr[idx] + "here!");
		}
		
	}

}
