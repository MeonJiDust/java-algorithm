package chap02;

import java.util.Scanner;

public class DayOfYear {

	
	static int mdays[][] = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		
		int days = d;
		
		for(int i = 1; i < m; i++) {
			
			days += mdays[isLeap(y)][i - 1];
			
		}
		
		return days;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int retry;
		
		System.out.println("start");
		
		do {
			System.out.println("year: ");
			int year = scanner.nextInt();
			
			System.out.println("month: ");
			int month = scanner.nextInt();
			
			System.out.println("day: ");
			int day = scanner.nextInt();
			
			System.out.printf("%d\n", dayOfYear(year, month, day));
			
			
			System.out.println("retry? ");
			retry = scanner.nextInt();
			
		}while(retry == 1);

	}

}
