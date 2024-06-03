package io.file.ch01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyBufferedInputStream {

	public static void main(String[] args) {

		// 보조 스트림에 사용 --> 기반 스트림이 필요하다.
		FileInputStream fin = null;
		BufferedInputStream bfin = null;

		try {
			// 기반 스트림
			fin = new FileInputStream("a.txt");

			// 보조 스트림(기반 스트림)
			bfin = new BufferedInputStream(fin);

			int data;

			while ((data = bfin.read()) != -1) {
				System.out.println((char) data);

			}
		} catch (Exception e) {
			// 리소스 자원 정리 -> 반대로 -> 열었던 자원을 반대로 닫아 주면 된다.
			if(bfin != null) {
				try {
					bfin.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	} // end of main

} // end of class
