package basic.ch14;

public class ArrayTest2 {

	public static void main(String[] args) {

		String[] names = new String[5]; // 5칸짜리 메모리 공간 할당.

		// C - 생성 create
		names[0] = "김씨";
		names[1] = "나씨";
		names[2] = "박씨";
//		names[3] = null;
//		names[4] = null;

		// R - 조회 read
		System.out.println(names);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);

		// U - 수정 update
		names[0] = "Mr.Kim"; // -->덮어쓰기 하면 된다.
		names[1] = "Mr.Na";
		names[2] = "Mr.Park";

		// D - 삭제 delete
		names[0] = null;
		names[1] = null;
		names[2] = null;

		// 자바에서 null값은 할당되지 않은 상태를 의미한다.
		// Object타입에서 사용가능

		// 1단계
		// 배열에 길이와 인덱스 길이에 대한 이해
		// --> 인덱스 길이는 n - 1 이다.
		System.out.println("배열 크기 : " + names.length);
		System.out.println("인덱스 크기(n-1) : " + (names.length - 1));

		// 문제2
		// 배열에 크기가 50개이면 인덱스 길이는 얼마인가? --> 49
		// 배열에 크기가 100개이면 인덱스 길이는 얼마인가? --> 99
		// 배열에 크기가 375개이면 인덱스 길이는 얼마인가? -->374

	}// end of main

}// end of class
