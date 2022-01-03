package chap01;

public class prac03 {

	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("min: " + min4(6, 3, 73, 4));

	}

}
