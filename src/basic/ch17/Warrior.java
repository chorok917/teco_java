package basic.ch17;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	// 오버라이드
	@Override
	void attack() {
		System.out.println("전사가 기본 공격을 합니다.");
	}

	void comboAttack() {
		System.out.println("전사가 2단 공격을 합니다.");
	}

}
