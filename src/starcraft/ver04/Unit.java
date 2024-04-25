package starcraft.ver04;

/**
 * public protected -- 상속관계 설정할 수 있다. default private
 */

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

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

	public void showInfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

	public void beAttacked(int power) {
		// 방어적 코드가 필요할 거 같다.
		if (hp <= 0) {
			System.out.println("[" + this.name + "]" + "이미 사망하였습니다.");
			hp = 0;
			return; // 이 상황이 왔을 때 더이상 아래로 내려가지 않게 return;
		}
		hp -= power;
	}

	public void attack(Unit chr) {
		System.out.println(this.name + "이" + chr.getName() + "을 공격합니다.");
		chr.beAttacked(this.power);
	}

}
