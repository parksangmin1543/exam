package main;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();

		list.add(new Human());
		list.add(new Tiger());

		for (int i = 0; i < list.size(); i++) {
			list.get(i).s();
			list.get(i).r();

			if (list.get(i) instanceof Human) {
				((Human) list.get(i)).b();
			}
			if (list.get(i) instanceof Tiger) {
				((Tiger) list.get(i)).h();
			}
			System.out.println();
		}
	}
}

abstract class Animal {
	public void s() {
	}
	public void r() {
	}
}

class Human extends Animal {
	public void s() {
		System.out.println("밤에는 잠을 잡니다.");
	}

	public void r() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void b() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {

	public void s() {
		System.out.println("밤에는 잠을 잡니다.");
	}

	public void r() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void h() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}
