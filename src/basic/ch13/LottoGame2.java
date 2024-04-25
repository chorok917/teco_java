package basic.ch13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 전체 1~6까지 나온 값을 오름차순으로 정렬
		// 단, 중복 값 제외

		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2 + "\t");
		System.out.println(gameNumber3 + "\t");
		System.out.println(gameNumber4 + "\t");
		System.out.println(gameNumber5 + "\t");
		System.out.println(gameNumber6 + "\t");

		System.out.println("==================================");

		// 수식을 작성해주세요.
		// if --> 반복문 사용금지 if문 6개로 구성해주세요.
		int oldBox = 0;

		if (gameNumber1 > gameNumber2) {
			oldBox = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = oldBox;
		}
		if (gameNumber2 > gameNumber3) {
			oldBox = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = oldBox;
		}
		if (gameNumber3 > gameNumber4) {
			oldBox = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = oldBox;
		}
		if (gameNumber4 > gameNumber5) {
			oldBox = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = oldBox;
		}
		if (gameNumber5 > gameNumber6) {
			oldBox = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = oldBox;
		}

		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2 + "\t");
		System.out.println(gameNumber3 + "\t");
		System.out.println(gameNumber4 + "\t");
		System.out.println(gameNumber5 + "\t");
		System.out.println(gameNumber6 + "\t");

	}// end of main

}// end of class
