package structure;

/**
 * 배열을 활용한 클래스를 설계하기 물론 이미 자바 표준 API 개발자들이 잘 만들어 둔 클래스들이 존재한다. 하지만 직접 기능을 확장해서
 * 만들어보자.
 */
public class TencoIntArray {

	int[] intArr;
	int count; // 배열 안에 들어갈 요소의 갯수를 관리
	public final int ARRAY_SIZE;
	public static final int ERROR_NUM = -9999999;

	public TencoIntArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}

	public TencoIntArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}

	// 기능 설계
	// 배열 요소에 제일 뒤에 값을 추가하는 기능
	public void addElement(int inputData) {
		// 방어적 코드 필요 (배열 벗어나는 예외 상황 발생 가능)
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return; // 더이상 초과되지 않도록 실행 제어권을 반납!
		}

		intArr[count] = inputData;
		count++;
	}
	// 배열에 요소를 추가하는 기능 만들어보기
	// 배열에 지정된 인덱스 위치에 값을 추가하는 기능 만들어보기
	// 지정한 인덱스 번호에 맞는 요소(elements)를 출력하는 기능 만들어보기
	// 지정한 인덱스 번호에 요소를 삭제하는 기능 만들어보기

}
