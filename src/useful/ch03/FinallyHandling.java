package useful.ch03;

import java.util.Scanner;

public class FinallyHandling {

	// main thread
	public static void main(String[] args) {

		// try-catch-finally
		// 언제 finally를 사용해야 할까?
		// 자원을 반드시 닫아주어야 할 때 등등..
		Scanner sc = new Scanner(System.in);

		try {
			int result = sc.nextInt();
			System.out.println("result : " + result);
			// scanner 의 자원을 다 사용했다면 자원을 해제해야 된다.
		} finally {
			sc.close();
			System.out.println("자원 해제 완료");
		}

		// 예제 핵심 : 예외가 발생 되더라도 finally 블록을 실행해서 자원을 닫을 수 있다.

	} // end of main

} // end of class
