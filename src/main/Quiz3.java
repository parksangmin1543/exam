package main;

public class Quiz3 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (sum < 300) {
			i++;
			sum += i;
		}
		System.out.println("i:" + i + " , sum:" + sum);
	}

}
