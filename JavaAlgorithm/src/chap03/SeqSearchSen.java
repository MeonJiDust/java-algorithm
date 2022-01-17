package chap03;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int a[], int n, int key) {
		
		int i = 0;
		
		a[n] = key;
		
		while(true) {
			
			if(a[i] == key) {
				break;
			}
			i++;
		}
		
		return i == n ? -1 : i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input: ");
		int num = scanner.nextInt();
		
		int arr[] = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("key: ");
		int key = scanner.nextInt();
		
		int idx = seqSearchSen(arr, num, key);
		
		if(idx == -1) {
			System.out.println("-1");
		}else {
			System.out.println(idx + "here!");
		}
	}

}
