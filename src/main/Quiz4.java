package main;

public class Quiz4 {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6,8,10};
		int[] arr1 = {2, 4};
		
		System.out.println("첫번째 배열의 합계: " + sum(arr));
		System.out.println("두번째 배열의 합계: " + sum(arr1));
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr.length < 3) {
				sum = -999;
				break;
			}
			sum += arr[i];
		}
		return sum;
	}

}
