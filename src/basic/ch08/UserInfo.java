package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;

	// 생성자 오버로딩이란 생성자의 개수가 여러개라는 의미이다.

	// 기본 생성자 형태 만들어보기
	public UserInfo() {
	}

	public UserInfo(String id) {
		userId = id;
	}

	public UserInfo(String id, String name) {
		userId = id;
		userName = name;
	}

	// 연습문제
	// 1 - 매개변수 3개를 받는 생성자를 만들어 주세요.
	public UserInfo(String id, String pw, String name) {
		userId = id;
		userPassword = pw;
		userName = name;
		showInfo();
	}

	// 2 - 매개변수 4개를 받는 생성자를 만들어 주세요.
	public UserInfo(String id, String pw, String name, String addr) {
		userId = id;
		userPassword = pw;
		userName = name;
		userAddress = addr;
	}

	// 3 - 매개변수 5개를 받는 생성자를 만들어 주세요.
	public UserInfo(String id, String pw, String name, String addr, String phone) {
		userId = id;
		userPassword = pw;
		userName = name;
		userAddress = addr;
		phoneNumber = phone;
	}

	public void showInfo () {
		System.out.println("아이디는 " + userId);
		System.out.println("비밀번호는 " + userPassword);
		System.out.println("이름은 " + userName + " 님");
	}
	
}// end of class
