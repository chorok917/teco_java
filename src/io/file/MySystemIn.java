package io.file;

import java.io.IOException;

public class MySystemIn {

	public static void main(String[] args) {

		// 키보드에서 데이터를 받아 응용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요");

		// 바이트 기반으로 동작 --> 바이트는 0과 1로 구성
		// 정수요소 - byte, short, int, long
		int i;
		
		// 한 바이트씩 키보드에 값을 읽어라
		try {
			// 97 != 13 ---> true (13은 enter키이다.)
			while ((i = System.in.read()) != '\n') {
				System.out.println("i : " + i);
				System.out.println("(char)i : " + (char) i);
			}

			i = System.in.read();
			System.out.println("---------------");

			// 출력
			System.out.println("i : " + i);

			// 문자로 변환하고 싶다면 --> 컴퓨터 안에 있는 문자표를 활용
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
