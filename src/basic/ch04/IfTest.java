package basic.ch04;

public class IfTest {

	// 변수명을 작성할 때 -- 약속(권장사항) --> 코딩 컨벤션
	// int myScore; <-- 카멜 표기법(로테이션) (소문자로 시작한 후 띄워쓰기 대신 대문자)
	// 글자 굴곡이 낙타 같다~ 해서 헝그리 개발자들이 붙인 것
	// 첫 시작 글자를 대문자로 작성하고 연결에 단어도 대문자 표기한다면
	// ---> 파스칼 케이스
	public static void main(String[] args) {

		// 조건문 (제어문) if
		// 주어진 조건에 따라서 실행이 이루어 지도록 흐름을 만든다.
		// if ... -> 만약 ... 이라면 
		
		boolean flag = true;
		
		if(flag) {
			// '조건식이 참이라면 해당 란을 수행해'라는 수행 구문.
			System.out.println("너 출력됨");
			flag = false;
			
		} // end of if -- 블록에 범위를 기억하자.
		// if문 단독은 수행이 될 수도 있고 안 될 수도 있다.
		System.out.println("코드가 여기까지 내려옵니다. : " + flag);
		
	} // end of main

} // end of class
