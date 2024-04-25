package basic.ch04;

public class BreakTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// for문 대신에 while문으로 변경해서 결과를 출력해보세요.
//		int start = 1;
//		int end = 7;
//		int result = 0;
//		boolean flag = true;
//		
//		while(flag) {
//			
//			result = start;
//			
//			if(start == end) {
//				flag = false;
//			}
//			
//			System.out.println(result);
//			
//			start++;
//		}

		int i = 1;
		while(i < 11) {
			// 단독 if 구문은 수행이 될 수도 있고 안될 수도 있다.
			if(i % 7 == 0) {
				// 중간에 멈추어라 -> break;
				break;
			}
			System.out.println("i의 값 : " + i);
			
			i++;
		}
	
		
	} // end of main

} // end of class
