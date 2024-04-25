package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMarchineTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		ToyMarchine[] products = new ToyMarchine[3];
		products[0] = new LionDoll();
		products[1] = new BearDoll();
		products[2] = new Airpods();

		final String LIONBOTTON = "1";
		final String BEARBOTTON = "2";
		final String AIRPODSBOTTON = "3";
		final String START = "1";
		final String END = "2";

		boolean falg = true;
		while (falg) {
			System.out.println("뽑기게임 --> 1.시작 2.종료");
			String startBotton = sc.nextLine();
			if (startBotton.equals(START)) {
				System.out.println("1.사자인형 2.곰인형 3.에어팟");
				int resultNum = random.nextInt(10) + 1;
				String pushBotton = sc.nextLine();
				if (pushBotton.equals(LIONBOTTON) && resultNum % 2 == 0) {
					if(((LionDoll) products[0]).stock == 0) {
						System.out.println("재고부족");
					}else {
						products[0].getProducts();
						((LionDoll) products[0]).checkStock();
					}
				} else if (pushBotton.equals(BEARBOTTON) && resultNum % 2 == 1) {
					products[1].getProducts();
				} else if (pushBotton.equals(AIRPODSBOTTON) && resultNum < 3) {
					products[2].getProducts();
				} else {
					System.out.println("뽑기 실패");
				}
			} else if (startBotton.equals(END)) {
				falg = false;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}

//		for (int i = 0; i < products.length; i++) {
//			if (products[i] instanceof LionDoll) {
//				((LionDoll) products[i]).checkStock();
//			} else {
//			}
//
//		}

	}// end of main

}// end of class
