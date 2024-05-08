package structure;

import java.util.Iterator;

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

	// 배열에 지정된 인덱스 위치에 값을 추가하는 기능 만들어보기
	public void insertElement(int position, int inputData) {
		// int position --> 저장하고자 하는 위치
		// int inputData --> 저장하고싶은 값
		// 방어적 코드 작성
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return;
		}

		// 방어적 코드를 하나 떠 짜야 하는 경우는?
		// 길이에 벗어나는 포지션을 입력했을 때!
		if (position < 0 || position > ARRAY_SIZE) {
			System.out.println("지정한 인덱스 번호가 잘못 되었습니다.");
			return;
		}

		// 요청값 : position -> 3
		// [11,12,13,[]14,15] -> 14는 덮어쓰기 해서 사라지게 되니 한 칸 밀어야 한다. ->[11,12,13,[],14,15]
		for (int i = count - 1; i >= position; i--) {
			intArr[i + 1] = intArr[i]; // 하나씩
			// intArr[5] = 15; 수행1
			// intArr[4] = 14; 수행2
		}
		intArr[position] = inputData;
		count++;
	}

	// 지정한 인덱스 번호에 맞는 요소(elements)를 출력하는 기능 만들어보기
	public int getElement(int position) {
		// 배열에 크기가 10이라고 가정
		// [0][1][2] --> 카운트가 3이라면 데이터
		if (position < 0 || position > count - 1) {
			System.out.println("검색 위치 오류. 현재 리스트 갯수는 " + count + "개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}

	// 요소를 전체 출력하는 기능 만들어주기
	public void printAll() {
		// 방어적 코드
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		// 만약에 출력할 요소가 있다면 반복문으로
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
//		for (int i : intArr) {
//			
//		}
	}

	// 지정한 인덱스 번호에 요소를 삭제하는 기능 만들어보기
	// 전체삭제
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		// 현재 요소 개수 상태를 항상 관리하고 처리해야 한다.
		count = 0;
	}

	// 지정한 인덱스 번호에 요소 삭제하기
	public void removeElement(int position) {
		// 만약 모두 비었다면 출력할 필요가 없다

		if (isEmpty()) {
			System.out.println("삭제할 요소가 없습니다.");
		}
		// position : 2 <--- 넘겨 받은 값
		System.out.println("Log 2 : " + count);
		// 인덱스 범위를 잘못 지정했다면 방어적 코드
		if (position < 0 || position >= count) {
			System.out.println("잘못된 요청입니다.");
		}

		for (int i = position; i < count; i++) {
			System.out.println("Log 3 : " + i);
			intArr[i] = intArr[i + 1];
		}
		count--;
	}

	// 배열 크기가 아니면 현재 요소에 갯수를 반환하기
	public int getCountSize() {
		return count;
	}

	// 현재 요소가 하나도 없는 상태이다. isEmpty라는 단어를 많이 쓴다.
	// 정수값이나 데이터는 get 단어를 쓰는데 boolean은 is를 많이 쓴다.
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

} // end of class
