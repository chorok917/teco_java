package basic.exercise;

import java.util.Scanner;

public class IfExercise2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 오답
		// Scanner sc = new Scanner(System.in);
		// int credit = sc.nextInt();
		//
		// if (credit > 100) {
		// System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요.");
		// } else if (99 >= credit) {
		// System.out.println("'A' 학점");
		// } else if (89>=credit) {
		// System.out.println("'B' 학점");
		// }

		System.out.println("성적을 입력하세요(0~100)");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
		String message = "잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요."; // 추가적인 피드백 메시지
		// message = "문자열을 담을 수 있다."
		// 이중 if문
		if (score <= 100 && score >= 0) {

			if (score <= 100 && score >= 90) {
				grade = 'A';
				System.out.println(grade + "학점");
				System.out.println("우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.");
			} else if (score <= 89 && score >= 80) {
				grade = 'B';
				System.out.println(grade + "학점");
				System.out.println("좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!");
			} else if (score <= 79 && score >= 70) {
				grade = 'C';
				System.out.println(grade + "학점");
				System.out.println("괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.");
			} else if (score <= 69 && score >= 60) {
				grade = 'D';
				System.out.println(grade + "학점");
				System.out.println("학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.");
			} else {
				grade = 'F';
				System.out.println(grade + "학점");
				System.out.println("불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.");
			}
		} else {
			System.out.println(message);
		} // end of for

		sc.close();

	} // end of main

} // end of class
