package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;

	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}

	// 사용자 ID 등록 가능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	}

	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		// 실행 흐름 만들기 --> while, if
		// 결과 -> 정상 유저 등록
		// --> 이미 등록된 사용자 입니다.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("아이디를 입력하세요.");
			String input = sc.nextLine();
			;

			if ("exit".equals(input)) {
				System.out.println("시스템 종료");
				break; // while 종료
			}
			boolean isRegistered = registerUserID(input);
			if (isRegistered) {
				System.out.println("새로운 사용자 등록" + input);
			} else {
				System.out.println("이미 등록된 사용자" + input);
			}
		}
		sc.close();

	}

	// 코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();
	} // end of main

} // end of class