package basic.ch02;

public class TraingleAreaCalculator {

	public static void main(String[] args) {

		// 도전 과제 2
		// 삼각형의 면적을 계산하는 코드를 작성해 보자. ( 밑변 * 높이 ) / 2

		// 삼각형에 밑변 BASE, 단 상수로 선언
		final double BASE = 10.0;
		// 삼각형의 높이 HEIGHT, 단 상수로 선언
		final double HEIGHT = 5.0;
		// 결과 값을 area 변수에 저장
		double area = (BASE * HEIGHT) / 2;
		// 결과 출력하기
		System.out.println("삼각형의 면적 : " + area);

		// 아래 출력방식도 가능하다.
		String result = "삼각형의 면적 : " + area;
		System.out.println(result);
		
	}

}
