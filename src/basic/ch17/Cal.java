package basic.ch17;

public class Cal {

	public Cal() {
		System.out.println("Cal() 부모 생성자 호출");
	}

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiplry(int n1, int n2) {
		System.out.println("2.호출");
		System.out.println("여기는 부모 클래스 메서드입니다.");
		return n1 * n2;
	}

	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 3));
		System.out.println(cal2.multiplry(10, 0));
	}// end of main

}

class Cal2 extends Cal {

	public Cal2() {
		System.out.println("Cal2() 자식 생성자 호출");
	}

	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	// 부모 코드의 기능을 변경하고 싶다면 즉 재정의 하고 싶다면 --->
	// '오버라이드 처리한다'

//	public int multiplry(int n1, int n2) {
//		//a 또는 b --> 논리 연산자 --> 논리합 --> 둘 중에 하나라도 true라면 --> true이다.
//		//a 그리고 b --> 논리 연산자 --> 논리곱 --> 전부 true여야 --> true이다.
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0을 입력하지 마시오.");
//		}
//		return n1 * n2;
//	}

	@Override // <--- 오버라이드된 메서드라는 것을 알려준다.
	// 애노티이션, 어노테이션이라고 부른다 --> 일단 주석 + 힌트 라고 알아두자.
	public int multiplry(int n1, int n2) {
		System.out.println("1.호출");
		return super.multiplry(n1, n2);
	}

}