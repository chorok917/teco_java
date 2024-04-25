package basic.ch16;

/**
 * 메서드 오버로딩이란? 같은 이름의 메서드(함수)를 여러개 정의하는 것을 말한다.
 */
public class Calculator {

	// 메서드 이름은 같으나 매개변수나 반환값(?)을 다르게 해야
	// 컴파일러가 다른 것이라 인식한다.

	// 덧셈 메서드 생성
	// 정수 더하기
	public int add(int a, int b) {
		return a + b;
	}

	// 실수 더하기
	public double add(double a, double b) {
		return a + b;
	}

	// 정수 3개 더하기
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// 문자열 더하는 기능
	public String add(String str1, String str2) {
		return str1 + str2;
	}

}
