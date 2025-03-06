package main;

public class Quiz2 {

	public static void main(String[] args) {
		int x = 3;
		
		if (x >= 3 && x <= 5)
			System.out.println(x + "월은 봄입니다.");
		else if (x >= 6 && x <= 8)
			System.out.println(x + "월은 여름입니다.");
		else if (x >= 9 && x <= 11)
			System.out.println(x + "월은 가을입니다.");
		else if ((x >= 1 && x <= 2) || x == 12)
			System.out.println(x + "월은 겨울입니다.");
		else
			System.out.println(x + "월은 잘못된 값입니다.");
		
	}

}
