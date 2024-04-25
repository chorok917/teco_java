package starcraft.ver03;

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

	public void attack(Zealot zea) {
		System.out.println(this.name + "이" + zea.getName() + "을 공격합니다.");
		zea.beAttacked(this.power);
	}

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

}
