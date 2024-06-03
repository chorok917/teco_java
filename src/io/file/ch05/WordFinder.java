package io.file.ch05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordFinder {

	public static void main(String[] args) {

		String fileName = "article.txt";

		try (FileInputStream fis = new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr)) {

			// 단어 빈도를 저장하기 위한 HashMap 생성
			Map<String, Integer> wordCountMap = new HashMap<>();
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");

				// 분리된 단어들을 반복처리
				for (String word : words) {
					System.out.println("word : " + word);
					if (!word.isEmpty()) {
						// getOrDefault - 분리한 word 단어가 이미 map 구조에 존재한다면
						// 현재 값을 가져오고 없다면 0을 반환합니다.
						// wordCountMap key - String
						// wordCountMap value - Integer
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
					}
				}
			} // end of while

			String mostCommon = null;
			int maxCount = 0;
			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				if (entry.getValue() > maxCount) {
					mostCommon = entry.getKey();
					maxCount = entry.getValue();
				}
			}
			System.out.println("가장 많이 사용된 단어 : " + mostCommon + "," + maxCount + "회");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 1. 공백 기준으로 단어를 짤라서 어딘가 보관
		// 문자열을 공백 기준으로 다룰 수 있는 기능이 존재하는가? --> 문서, 구글 통해서 확인할 수 있다.
		String line = "";
		String[] word = line.split("\\s+");

		// 2. 단어 빈도를 저장하기 위한 변수를 사용(자료구조) -> HashMap
		// array는 중복이 들어가면 세알리기 어렵다.

	} // end of main

} // end of class
