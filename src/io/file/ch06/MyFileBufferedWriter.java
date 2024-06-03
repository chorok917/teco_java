package io.file.ch06;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MyFileBufferedWriter {

	public static void main(String[] args) {

		String filePath = "output2.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			bw.write("첫 번째 줄입니다.");
			bw.newLine();
			bw.write("두 번째 줄입니다.");
			bw.newLine();
			bw.write("세 번째 줄입니다.");

			// 버퍼를 비우고 데이터 쓰기
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
