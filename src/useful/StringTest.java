package useful;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc"); // 객체 생성했기 때문에 메모리 잡아먹는다.
		String str2 = new String("abc"); // 그렇다면 계속 메모리를 차지 할 것인가? --> 메모리 절약을 위해 상수풀 사용.
		System.out.println(str1 == str2);

		String str3 = "abc";
		String str4 = "abc"; // 불변
		// 상수풀에 올라간 String 값은 먼저 존재하는지 확인부터 한다.
		// 완전 똑같은 문자열 abc가 존재한다면
		// 새로 생성하지 않고 다시 재사용한다. <-- 이게 핵심!
		System.out.println(str3 == str4);
		// == 은 참조타입에 썼을 경우 객체의 주소값을 비교하는 녀석이다.
		// equals는 문자열 값을 비교하는 녀석이다.
		// 결론적으로 문자열 비교는 논리적인 판단으로 같은지 다른지 true, false 값을 반환한다.
		
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));

	}// end of main

}// end of class
