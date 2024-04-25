package basic.ch02;

/**
 * 컴파일 시점 --> .class 파일을 만들어 내는 과정 (javac 명령어 동작)
 * 런타임 시점 --> ctrl + F11 프로그램 실행 ~~~~~~~ 실행 종료까지
 * 
 * java 명령어는 프로그램을 실행시키는 명령어이다.
 * javac 명령어는 번역하는 과정이다. 해당 명령어는 cmd에서 입력가능.
 * 
 * 자바 언어로 코드를 작성하고 있어요
 * JDK 도구를 설치해야 자바프로그래밍이 가능. -> 여러 도구가 존재
 * JDK --> JRE(자바 프로그램 실행 환경) java runtime envirament
 * JRE --> JVM(자바 가상 머신)
 * JVM은 .class 파일을 실행 시켜주는 녀석이다.
 * JVM은 어떤 연산(다이내믹 랭킹)을 거쳐 이진코드(바이너리 파일로 변환시켜서 수행하는 녀석) 
 */
public class Constant {

	// 메인 함수 - 코드의 시작점
	public static void main(String[] args) {

		// 상수 선언 --> 값이 한 번 정해지면 변경할 수 없는 수(값, 데이터)
		// 상수는 대문자로 선언!
		final int MAX_NUM = 10;
		final int MIN_NUM;
		MIN_NUM = 0;
		
		// MAX_NUM = 100; // 컴파일 오류 발생
		// ctrl + s 누르면 IDE 툴이 javac Constant.java 명령어를 수행합니다.
		// 명령어의 결과로 Constant.class 파일이 생성됩니다.
		// why? JVM 이해할 수 있는 언어이기 때문에 번역을 해주어야 한다.
		
		System.out.println("-----------------------");
		// 원주율 상수로 선언
		final double PI = 3.14159;
		// 원 반지름을 상수로 선언
		final int RADIUS = 10;
		
		// 원 둘레 계산
		System.out.println(2 * PI * RADIUS);
		// 원 면적 계산 (원 내부 공간 크기)
		System.out.println(PI * RADIUS * RADIUS);
		
		
	} // end of main

} // end of class
