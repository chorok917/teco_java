package basic.ch23;

public class BankAccount {

	// field
	// 변수에 접근 하는 것은 객체 지향스럽지 못하다. 그래서 private 하고 getter,setter 만드는 것.
	private int money = 100_000;

	// Constructor

	/**
	 * Methods
	 */
	// 입금
	public synchronized void saveMoney(int money) {
		// synchronized 메서드!
		// 동기화는 코드가 순차적으로 흘러가게 도와준다.
		// 어떻게 도와주냐? --> 하나가 끝나기 전까지 lock을 걸고 다음 타자가 수행된다.
		int currentMoney = getMoney();

		// 시간이 걸림
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	} // end of saveMoney()

	// withDraw 출금
	public int withDraw(int money) {
		// 메소드와 블럭의 차이는 뭘까?
		// 메소드는 전체 동작!
		// 블럭은 synchronized 안에 있는 것만 동기화하겠다고 조건 거는 것.
		// 그러니까 메소드 자체가 synchronized가 될 수 있고 아니면 그 안에 블럭을 만들 수도 있다.
		synchronized (this) {
			int currentMoney = getMoney();

			// ... 출금은 0.5초 정도 시간이 걸림
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 방어적 코드 작성
			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("계좌 잔액이 부족합니다.");
				return 0;
			}
		}
	} // end of withDraw()

	// getter
	public int getMoney() {
		return money;
	}

	// setter
	public void setMoney(int money) {
		this.money = money;
	}

} // end of class
