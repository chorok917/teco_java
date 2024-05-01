package basic.ch13;

import java.util.Arrays;
import java.util.Random;

public class LottoNumberMaker2 {

	/**
	 * 멤버 변수 field
	 */
	private String version = "1.0.0";

	/**
	 * main 함수
	 */
	public static void main(String[] args) {
		int[] lottos = makeNumbers();
		Arrays.sort(lottos); // 오름차순 정렬 메소드
		for (int i = 0; i < lottos.length; i++) {
			System.out.println(lottos[i] + "\t");
		}
	} // end of main

	/**
	 * 인스턴스에 속하지 않는 함수
	 */
	// 번호 만들고, 중복 번호 제외하기
	public static int[] makeNumbers() {

		int[] numbers = new int[6];
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (numbers[j] == numbers[i]) {
					i--;
					break;
				} // if
			} // inner for

		} // outter for
		return numbers;
	} // end of makeNumbers

	// end of methods

} // end of class