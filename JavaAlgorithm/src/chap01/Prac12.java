package chap01;

public class Prac12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 11; i++) {
			for(int j = 1; j < 11; j++) {
				
				if(i == 1 && j == 1) {
					
					System.out.print("  |");
					
				}else if(i == 1 && j > 1) {

					System.out.printf("%3d", j - 1);
				}else if(i == 2 && j == 1) {
					System.out.print("---+");
				}else if(i == 2 && j > 1) {
					System.out.print("---");
				}else if(i > 2 && j == 1) {
					System.out.printf("%2d|", i - 2);
				}else if(i > 2 && j > 1) {
					System.out.printf("%3d", (i - 2) * (j - 1));
				}else if(i == 11) {
					System.out.printf("\n%2d|", i - 1);
					System.out.printf("%3d", (i - 1) * (j));
				}
			}
			System.out.println();
		}
	}

}
