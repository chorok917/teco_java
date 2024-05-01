package basic.ch23;

public class Mother extends Thread {

	// field 멤버 변수
	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withDraw(5_000);
	}

}
