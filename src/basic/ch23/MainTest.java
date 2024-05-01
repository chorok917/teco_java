package basic.ch23;

public class MainTest {

	public static void main(String[] args) {

		// 현재 잔액 : 10만원
		BankAccount account = new BankAccount();

		// 아버지 클래스 new
		// 생성자 의존 주입 (DI)
		Father father = new Father(account);
		father.start();

		// 어머니 클래스 new
		Mother mother = new Mother(account);
		mother.start();

		int resultMoney = account.getMoney();
		System.out.println("현재 잔액 : " + resultMoney); 
		// 정상처리 된다면 --> 10만원 + 1만원 -5천원 = 10만 5천원
		
	} // end of main

} // end of class
