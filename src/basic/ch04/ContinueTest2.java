package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		// ContinueTest1 자바 파일을 보고 ContinueTest2 자바 파일을 만들고
		// for 문 대신 while 구문을 활용해서 코드를 작성해 보세요
		// 화면에 1부터 100까지 숫자 중에 3의 배수를 출력하세요.

//		int start = 1;
//		int result = 0;
//		boolean flag = true;
//		
//		while (flag) {
//			result = start * 3;
//			
//			if(result > 100) {
//				flag = false;
//				break;
//			}
//			
//			System.out.println(result);
//			
//			start++;
//		}

//		int i = 1;
//		
//		while(i < 101) {
//			
//			if(i % 3 ==0) {
//				System.out.println("i의 값 : " + i);
//			}
//			
//			i++; 
//			식 사용하기 (무한 반복 예방)
//		}

		// 풀이 2 : 특정 조건이 되었을 때 반복문을 멈추어라.
		int i = 1;
		boolean flag = true;

		while (flag) {
			if(i % 3 == 0) {
				System.out.println("3의 배수 : " + i);
			}

			// 특정 조건을 걸어서 멈추게 해야 한다.

			if (i == 100) {
				// break;
				flag = false;
				// i = 100
			}

				i++; // i = 101
		}

	} // end of main

} // end of class
