package basic.ch17;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void attack() {
		System.out.println(name + "이 공격합니다");
	}

}
