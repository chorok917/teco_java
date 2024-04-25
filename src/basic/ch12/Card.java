package basic.ch12;

public class Card {

	//카드 번호가 발급 될 때마다 고유한 카드 번호를 가질 수 있도록 코드를 설계해주세요.
	
	//멤버 변수, static 변수
	private String bankName;
	static int cardSerialNumber = 2020;
	
	//생성자
	public Card(String bankName) {
		System.out.println(bankName);
		makeCard();
	}
	
	//멤버 함수
	public void makeCard() {
		System.out.println("카드 번호 : " + cardSerialNumber);
		cardSerialNumber++;
	}
		
	//get, set작성
	public void setCompany(String company) {
	}
	
	
	//코드 테스트(메인함수)
	public static void main(String[] args) {
		Card card1 = new Card("우리은행");
		
	}//end of main
	
	
}//end of class
