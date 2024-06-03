package io.file.ch03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

//	public static void main(String[] args) {
//		// (바이트 기반 스트림을 활용)
//		// 기반 스트림 + 보조 스트림을 활용해서
//		// 파일 복사 기능을 만들고
//		// 소요 시간을 측정하시오.
//		
//		String sourceFilePath = "D:\\vcs\\greenStardewValley\\img\\vege.zip";
//		String destinationFilePath = "vege_copy.zip";
//		
//		long startTime = System.nanoTime();
//		
//		try (FileInputStream in = new FileInputStream(sourceFilePath);
//				FileOutputStream out = new FileOutputStream(destinationFilePath)
//						BufferedOutputStream bos = new BufferedOutputStream(out)){
//			int data;
//			while((data = in.read()) != -1) {
//				out.write(data);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		long endTime = System.nanoTime();
//		long duration = endTime - startTime;
//		double seconds = duration / 1_000_000_000.0;
//		String resultFormat = String.format("소요시간은 : %.6f초 입니다.",seconds);
//		System.out.println(resultFormat);
//	} // end of main

}// end of class
