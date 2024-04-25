package basic.ch02;

public class RectangleAreaCalculator {

	public static void main(String[] args) {

		//도전 과제 1
		//사각형의 면적을 구하는 코드를 작성해보시오 단, 상수를 선언해서 활용하세요 
		// hint --> 가로, 세로
		
		final int RECTANGLE_WIDTH = 20;
		final int RECTANGLE_HEIGHT = 20;
		
		int area = RECTANGLE_WIDTH * RECTANGLE_HEIGHT;
		
		// 결과 출력하기
		
		System.out.println("사각형의 면적 : " + area);
		
		// 문자열은 특별한 녀석이다. 연산을 사용할 수 있습니다.
		// 문자열 + 정수, 문자열 + 실수 ... 
		// 위 연산에 결과 값은 ---> 문자열 리턴된다.
		
	} 

}
