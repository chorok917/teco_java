package basic.ch04;

public class WhileTest1 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 1부터 10까지 콘솔창에 숫자를 출력하고 싶어
//		System.out.print("1");
//		System.out.print("2");
//		System.out.print("3");
//		System.out.print("4");
//		System.out.print("5");
//		System.out.print("6");
//		System.out.print("7");
//		System.out.print("8");
//		System.out.print("9");
//		System.out.print("10");
		
		//  x  <= 10
		int i = 1;
		while(i <= 10) {
			System.out.print(i);
			
			// while 구문은 조건식에 처리가 없다면 무한이 반복한다.
			i++;
//			i = i + 1;
//			i += 1;
		} // end of while
		
	} // end of main

} // end of class
