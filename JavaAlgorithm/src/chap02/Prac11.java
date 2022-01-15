package chap02;

class YMD{
	
	int y;
	int m;
	int d;
	
	YMD(int y, int m, int d){
		
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	static int mdays[][] = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	static int isLeap(int year) {
		
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	public int After(int n) {
		
		if(isLeap(y) == 1) {
			if(mdays[1][m-1] == 31) {
				if((d + n) > 31) {
					return(d + n) - 31;
				}else {
					return (d + n);
				}
			}else if(mdays[1][m-1] == 30) {
				if((d + n) > 30) {
					return(d + n) - 30;
				}else{
					return (d + n);
				}
			}else if(mdays[1][m-1] == 29) {
				
				if((d + n) > 29) {
					return(d + n) - 29;
				}else{
					return(d + n) - 29;
				}
			}
		}else if(isLeap(y) == 0) {
			if(mdays[1][m-1] == 31) {
				if((d + n) > 31) {
					return(d + n) - 31;
				}else {
					return (d + n);
				}
			}else if(mdays[1][m-1] == 30) {
				if((d + n) > 30) {
					return(d + n) - 30;
				}else{
					return (d + n);
				}
			}else if(mdays[1][m-1] == 28) {
				
				if((d + n) > 28) {
					return(d + n) - 28;
				}else{
					return (d + n);
				}
			}
		}
		return d + n;
	}
}
public class Prac11 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
