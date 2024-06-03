package io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {

	public static void main(String[] args) {
		
		// 현재 시간(시작)
		long start = System.nanoTime(); // --> 더 정밀한 현재 시간을 출력
//		System.currentTimeMillis();
		String data = "기반 스트림 + 보조 스트림을 활용해보자";

		// try - catch - resource 활용
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			// 보조 생성(bos)될 때 기반(fos)을 넣어준다..
			// 코드 수행 부분
			byte[] bytes = data.getBytes();
			// 보조 스트림(버퍼)
			bos.write(bytes);
			// 간혹 버퍼에 데이터가 남아있다면 중복된 데이터를 쓸 수 있다.
			// 한 번 사용한 다음에
			bos.flush(); // flush --> 물을 내리다. // spring boot를 위해 꼭 이해해야 하는 개념!

			System.out.println("보조 스트림을 활용한 파일 출력 완료");
			// 시간 측정을 해보고 싶다.
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 현재 시간(종료)
		long end = System.nanoTime();
		// 종료 -(빼기) 시작 -> 소요 시간
		long duration = end - start;
		System.out.println("소요시간 : " + duration);
		// 나노초는 10억 분에 1 -> 0.000287초
	} // end of main

} // end of class
