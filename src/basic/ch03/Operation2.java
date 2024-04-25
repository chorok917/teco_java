package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {

		int result1 = 5 + 3; // 더하기
		int result2 = 5 - 3; // 빼기
		int result3 = 5 * 3; // 곱하기
		// 고민해 볼 사항
		// int result4 = 5.0 / 3;
		double result4 = 5.0 / 3; // 나누기
		int result5 = 5 % 3; // 나머지 값 연산자

		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);

		// 문제
		// 1. (12+3)/3 값을 화면에 출력해보세요.
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요.
		int intBox = (12 + 3) / 3;
		System.out.println(intBox);
		
		// 2. (25 % 2) 값을 화면에 출력해보세요
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 , 1이면 홀수
		double doubleBox1 = (25 % 2);
		System.out.println(doubleBox1);
		
		// 3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요.
		int intBox3 = 15 / 4;
		Math math;
		System.out.println(Math.abs(intBox3));
		
		// 도전문제
		// 직접 산술 연산자 문제 만들기 2개
		
		// 1. 과일가게에서 딸기를 만 원, 망고를 6천원, 용과를 7천원에 
		// 개당 가격으로 판매하고 있다.
		// 쇼핑 카트에 각 2개씩 담았다면 총 가격은 얼마일까?
		
		int strowberry_Price = 10000;
		int mango_Price = 6000;
		int dragonFurit_Price = 7000;
		
		int cartCount = 2;
		
		int cart_Price = cartCount * (strowberry_Price + mango_Price + dragonFurit_Price);
		
		int total_Price = cart_Price;
		
		System.out.println(total_Price);
		
		// 2. 동일 과일가게에서 딸기를 10%, 합산 가격에서 20%를
		// 추가로 할인해주는 이벤트를 진행한다.
		// 위에서 도출한 최종가격에 딸기와 최종 할인을 받으면
		// 총 얼마일까?
		
		double allSaleRate = 0.2;
		double berrySaleRate = 0.1;
		
		cart_Price = (int)(( cartCount * ( (strowberry_Price *(1 - berrySaleRate)) + mango_Price + dragonFurit_Price) ) * (1 - allSaleRate)) ;
		
		System.out.println(total_Price);
	
		
//	    double totalBerry = strowberry_Price * (1 - berrySaleRate);
//	    total_Price = (int)(cartCount * (totalBerry + mango_Price + dragonFurit_Price));
//	    System.out.println(total_Price);
	    
	    int total_Price2;
//	    total_Price2 = (int) (total_Price * (1 - allSaleRate));
//	    System.out.println(total_Price2);

	    
	    
	    
		
	} // end of main

} // end of class
