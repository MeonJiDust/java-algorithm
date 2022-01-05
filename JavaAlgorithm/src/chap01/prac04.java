package chap01;

public class prac04 {

	static int mid3(int x, int y, int z) {
		
		int mid = x;
		
		if(x >= y) {
			if(y >= z) {
				mid = y;
			}else if(x <= z) {
				mid = x;
			}else {
				mid = z;
			}
		}else if(x > z) {
			mid = x;
		}else if(y > z) {
			mid = z;
		}else {
			mid = y;
		}
		return mid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
