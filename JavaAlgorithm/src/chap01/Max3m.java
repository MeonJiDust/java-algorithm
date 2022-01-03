package chap01;

public class Max3m {
	
	static int max3(int a, int b, int c) { //여러번 반복해서 쓰는 내용이기 때문에 메소드 처리
		
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1: " + max3(3, 4, 2));
	}

}
