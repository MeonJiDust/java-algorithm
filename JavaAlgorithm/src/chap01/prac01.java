package chap01;

public class prac01 {

	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("result: " + max4(5, 4, 7, 3));
	}

}
