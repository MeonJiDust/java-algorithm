package chap02;

public class Prac03 {

	static int sumOf(int[] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 3, 4, 5};
		
		int sum = sumOf(arr);
		
		System.out.println(sum);
	}

}
