package io.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한 줄 입력하면 종료됨
// 여러 줄 반복적으로 동작할 수 있도록 기능을 추가해주세요.
public class StandardInputExample2 {

	public static void main(String[] args) {
		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다.!!
		// 보조는 기반이 있어야 사용할 수 있다.

		try (InputStreamReader isr = new InputStreamReader(System.in);
				// 이 기반은 옆으로 확장하는 스타일
				BufferedReader br = new BufferedReader(isr);) {
			// isr -> 한 문자씩 읽는 기능 read()가지고 있었다.
			// br -> 한 번에 한 라인씩 읽을 수 있는 기능을 가지고 있다.
			System.out.println("더 많은 텏스트를 입력하세요. (한 줄 단위) -> 엔터");
			
			// isr.read(); --> 기능 확장
			String inputUserData = br.readLine();
			System.out.println("이력 확인 : " + inputUserData);
		} catch (Exception e) {
		}
	}

}
