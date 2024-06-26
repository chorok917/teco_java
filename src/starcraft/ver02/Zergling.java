package starcraft.ver02;

public class Zergling {

	private String name;
	private int power;
	private int hp;

	// 생성자는 객체가 메모리에 올라갔을 때 제일 먼저 실행하는 것이다.
	public Zergling(String name) {
		this.name = name;
		power = 3;
		hp = 50;
	}

	// get, set - 단축키 (alt+shift+s)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 메소드 오버로딩 기법으로 리팩토링하기
	public void attack(Zealot zea) {
		System.out.println(this.name + "이" + zea.getName() + "을 공격합니다.");
		zea.beAttacked(this.power);
	}

	public void attack(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "을 공격합니다.");
		m.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드가 필요할 거 같다.
		if (hp <= 0) {
			System.out.println("[" + this.name + "]" + "이미 사망하였습니다.");
			hp = 0;
			return; // 이 상황이 왔을 때 더이상 아래로 내려가지 않게 return;
		}
		hp -= power;
	}

	public void showInfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}
}
