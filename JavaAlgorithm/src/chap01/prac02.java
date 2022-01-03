package chap01;

public class prac02 {

	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("min: " + min3(3, 6, 2));

	}

}
