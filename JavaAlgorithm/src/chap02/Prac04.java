package chap02;

public class Prac04 {
	
	static void copy(int arr1[], int arr2[]) {
		
		for(int i = 0; i < arr2.length; i++) {
			
			arr1[i] = arr2[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {6, 7, 8, 9, 10};
		
		copy(arr1, arr2);
		
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i]);
		}
	}

}
