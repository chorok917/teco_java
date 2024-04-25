package basic.ch07;

public class User {

	String id;
	String password;
	String name;
	String gender;
	int age;

	//패스워드 체크 기능 만들어보기
	//메서드 함수는 동사로 시작하는 것이 권장 사항이다.
	public boolean checkPassword(String inputPwd) {
		//만약 나의 멤버 변수에 들어가 있는
		//password 값과 외부에서 넣을 inputPwd 값이
		//같다면 true 반환 아니면 false 반환하라
		// == 은 주소값, 산술식에 사용한다.
		// 문자열 비교는 equals라는 메서드를 사용한다.
		if(password.equals(inputPwd)) {
			return true; //반환할 때는 return 키워드 사용
		}
		return false;
	}
	
	//main 메서드는 독립적인 함수로써 여기서 실행시킬 수 있다.
	public static void main(String[] args) {
		//User 클래스를 인스턴스화 시켜주세요.
		User user1 = new User(); //heap이라는 동적 메모리에 올라간다.
		user1.password = "123";
		
		User user2 = new User();
		user2.password = "555";
		
		System.out.println("----------------------");
	
		//user1 pwd를 확인하고 싶다.
		//1
		boolean user1Result = user1.checkPassword("333");
		System.out.println("user1 : " + user1Result);
		//2
		boolean user1Result2 = user1.checkPassword("123");
		System.out.println("user1 두번째 결과 : " + user1Result2);
		
		System.out.println("----------------------");
		//참조 변수 user2 기능인 checkPassword 호출해서 결과를 확인해주세요.
		//첫 번째는 -- F
		//두 번째는 -- T
		boolean user2Result = user2.checkPassword("666");
		System.out.println("user2 : " + user2Result);
		boolean user2Result2 = user2.checkPassword("555");
		System.out.println("user2 : " + user2Result2);
		
		//실행에 흐름 만드는 방법 연습입니다.
		//if구문을 활용해서 콘솔창에 '비밀번호가 틀렸습니다.' 출력하거나
		//'비밀번호가 맞습니다'를 출력하면 된다.
		if(user2Result == true) {
			System.out.println("비밀번호가 맞습니다.");
		} else {
			System.out.println("비밀번호가 틀립니다.");
		}
		
		
	} // end of main
	
	
}// end of class
