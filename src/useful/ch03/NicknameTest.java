package useful.ch03;

import java.util.Scanner;

public class NicknameTest {

	// main thread
	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);
		String userNickName;

		// Object
		Nickname nickname = new Nickname();
		
		//
		System.out.println("닉네임을 입력하세요.");
		userNickName = sc.nextLine();
		nickname.setNickName(userNickName);

	} // end of main

} // end of class
