package useful.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	// main thread
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("demo.txt");
			// return;
		} catch (FileNotFoundException e) {
			System.out.println("catch 구문 실행!");
			e.printStackTrace(); // <-- 오류 발생한 시점을 추적해서 하나하나 찍어준다.
		} finally {
			// 반드시 수행되어야 하는 코드 영역
			// 심지어 return 키워드를 만나더라도 여기는 수행이 된다.
			System.out.println("finally 블록 수행");
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} // 닫는 시점에 fis. <-- 객체가 생성되지 않았을 수도 있다. 그래서 예외처리하는게
				// 안정적이라고 알려주는 것이다.
		}

		System.out.println("비정상 종료되지 않았습니다.");

	} // end of main

} // end of class
