package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
	
	static class PhyscData{
		
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderCompartor();
		
		private static class HeightOrderCompartor implements Comparator<PhyscData>{
			
			public int compare(PhyscData d1, PhyscData d2) {
				
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		PhyscData[] xDatas = {
				new PhyscData("이시현", 153, 0.7),
				new PhyscData("박승우", 169, 1.2),
				new PhyscData("문서영", 155, 1.0),
				new PhyscData("김한결", 171, 1.4),
				new PhyscData("전서현", 174, 1.5),
		};
		
		System.out.println("how? ");
		
		int height = scanner.nextInt();
		int idx = Arrays.binarySearch(
				xDatas, 
				new PhyscData("", height, 0.0),
				PhyscData.HEIGHT_ORDER
		);
		
		if(idx < 0) {
			System.out.println("X");
		}else {
			System.out.println("x[" + idx + "] here!");
			System.out.println("data: " + xDatas[idx]);
		}

	}

}
