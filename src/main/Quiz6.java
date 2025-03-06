package main;

public class Quiz6 {

	public static void main(String[] args) {
		bolPen bol = new bolPen(2, "100%", "파랑색");
		penPil pil = new penPil(3, "80%", "몽블랑");
		
		bol.showInfo();
		System.out.println();
		pil.showInfo();
	}
}

class Pen {
	int pP;
	String pM;
	
	public Pen(int pP, String pM) {
		this.pP = pP;
		this.pM = pM;
	}
}

class bolPen extends Pen {
	String pC;
	public bolPen(int pP, String pM, String pC) {
		super(pP, pM);
		this.pC = pC;
	}
	
	public void showInfo() {
		System.out.println("펜의 굵기: " + this.pP);
		System.out.println("남은 양: " + this.pM);
		System.out.println("볼펜의 색: " + this.pC);
	}
}

class penPil extends Pen {
	String pB;
	public penPil(int pP, String pM, String pB) {
		super(pP, pM);
		this.pB = pB;
	}
	public void showInfo() {
		System.out.println("펜의 굵기: " + this.pP);
		System.out.println("남은 양: " + this.pM);
		System.out.println("브랜드: " + this.pB);
	}
	
}
