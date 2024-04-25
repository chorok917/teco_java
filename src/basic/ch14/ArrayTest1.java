package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열이란
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입이다.

		// 배열 특징(중요!)
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.

		// 배열 메모리 공간 만들기
		int[] numbers;
		numbers = new int[3];
		int intBoxes[] = new int[5];

		// 메모리공간 선언 후 값을 어떻게 초기화 할까? (=값 넣기)
		// 배열 길이 --> 3 , 인덱스 길이 --> 2
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;
		// numbers[3] = 1003; <-- 인덱스 길이를 벗어났음, 오류 발생
		// 사전 기반 지식 - 모든 프로그래밍에 인덱스 번호 시작은 0부터 시작한다.

		// 배열에 선언과 동시에 초기화
		int[] grades = new int[] { 5, 3, 1 };
		int[] grades2 = { 5, 3, 1 }; // new int[] <--- 생략 가능하다.

		// 문제1
		// 5개의 크기를 가지는 double 타입의 배열을 선언하시오.
		// 단 배열 이름은 마음대로 작성하세요.
		double[] doubleBox = new double[5]; // --> [][][][][]

		// 문제2
		// 위에서 선언한 배열에 값을 인덱스 0~2까지 초기화하시오.
		// 값은 아무거나 상관없음
		doubleBox[0] = 3.14;
		doubleBox[1] = 3.14159;
		doubleBox[2] = 3.14159279;

		// doubleBox[3] = 0.0; //-->값을 넣지 않으면 0으로 초기화 되어 있다.
		// doubleBox[4] = 0.0;

		// 문제3
		// String 타입에 배열을 선언. 배열 크기는 3개
		// 선언과 동시에 초기화하세요.
		String[] text = new String[] { "가", "나", "다" };
		String[] text2 = { "가", "나", "다" };

	}// end of main

}// end of class
