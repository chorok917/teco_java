package basic.ch02;

public class DiscountCalculatory {

	public static void main(String[] args) {

		// 상수 선언 - 원가, 할인율
		final double ORIGINAL_PRICE = 59.99;
		final double DISCOUNT_RATE = 0.3;
		
		// 할인된 가격 계산하기 (비지니스 로직)
		double discountedPrice = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);
		
		// 최종 가격을 정수형으로 변환
		int customerPrice = (int)discountedPrice;
		
		//결과 출력
		System.out.println("최종 가격 : " + customerPrice);
		System.out.println("최종 가격(소수점) : " + discountedPrice);
		
	}

}
