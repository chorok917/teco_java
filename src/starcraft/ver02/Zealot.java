package starcraft.ver02;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}

	// private 변수값을 보여주는 getter 메소드
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 메소드 오버로딩 기법으로 리팩토링하기
	public void attack(Zergling z) {
		System.out.println(this.name + "이" + z.getName() + "을 공격합니다.");
		System.out.println(z.getName() + "이" + this.power + "만큼 피해 입었습니다.");
		z.beAttacked(this.power);
	}

	public void attack(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "을 공격합니다.");
		System.out.println(m.getName() + "이" + this.power + "만큼 피해 입었습니다.");
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
