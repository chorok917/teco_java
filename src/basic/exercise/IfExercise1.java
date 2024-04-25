package basic.exercise;

import java.util.Scanner;

public class IfExercise1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 정수값 입력 받기를 활용해서 코드에 흐름을 만들어주세요.

		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		System.out.println("로깅 - 받은 값 확인 : " + point);

		if (point >=  90) {
			System.out.println("A학점 입니다.");
		} else if (point >=  80) {
			System.out.println("B학점 입니다.");
		} else if (point >=  70) {
			System.out.println("C학점 입니다.");
		} else if (point >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		
		sc.close();
		
	} // end of main

} // end of class
