package basic.ch10;

//은행
public class Bank {

	//아무것도 지정하지 않으면 default 제어 지시자이다.
	//private 클래스 안에서만 사용이 가능하다.
	//balance : 잔액
	private String name;
	private int balance; //정보은닉 --> 외부에서 확인 안되어야 하는 중요한 변수를 감춘다.
	
	//deposit : 입금하다
	public void deposit(int money) {
		balance = balance + money;
		showInfo();
	}
	
	//withdraw : 출금하다
	public int withdraw(int money) {
		//방어적 코드를 작성
		if(balance < money) {
			System.out.println("잘못된 요청입니다.");
			return 0;
		}
		balance = balance - money;
		showInfo();
		return money;
	}
	
	//현재 은행의 총 잔액을 출력하다.
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + "입니다.");
	}
	
	//정보 은닉 후에 (private) getter, setter 메서드를 설계해 둘 수 있다.
	//get 메서드란 단순히 객체의 상태 변수를 리턴하는 메서드이다.
	public int getBalance() {
		return this.balance;
	}
	public String getName() {
		return this.name;
	}
	
	//멤버 변수에 접근해서 객체의 상태 값을 변경하게 하는 메서드(리턴타입X)
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setBalance(int money) {
		//방어적 코드 작성하기
		if(money < 0) {
			System.out.println("잘못된 입력입니다.");
		}
		this.balance = money;
	}
	
	
}//end of class
