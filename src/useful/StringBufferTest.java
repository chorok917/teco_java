package useful;

public class StringBufferTest {

	// 코드의 시작점 - (메인 작업자)
	public static void main(String[] args) {

		String str1 = new String("Hello"); // heap 객체 생성
		String str2 = new String("World"); 

		StringBuffer bufferStr = new StringBuffer("Hello"); // StringBuffer 객체 생성
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소 값

		bufferStr.append(str2); // bufferStr 변수에 str2 변수 더하기
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); // 같은 주소값이 나오니 새로운 객체가 생성된 건 아니다.
		
		//1번 결과와 2번 결과 주소값이 같다라는 의미는 
		//새로운 메모리를 할당한 것이 아닌 변경한 것이다.
		
		//활용
		String newStr = bufferStr.toString(); // toString 호출시 타입 -> String
		
	} // end of main

} // end of class
