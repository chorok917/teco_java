package structure.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import basic.ch22.Student;

public class MyArrayListTest {

	// 메인 쓰레드
	public static void main(String[] args) {

		List mList; // 리스트 인터페이스 계열

		// ArrayList 클래스의 인스턴스화 처리
		ArrayList list = new ArrayList();
		// 제네릭은 추후 더 설명
		// 제네릭은 타입을 명시화하는 것이다.
		// num : 정수값만 들어갈 수 있다고 말해준다. 다른 데이터값은 X.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// 변수 선언과 동시에 초기화 --> 값이 들어가 있는 상태인가? X.배열공간, 메모리 공간만 선언. 길이가 없다.
		ArrayList<Integer> num2 = new ArrayList<>(); // < > 다이아몬드 연산자 안에 반복되니까 생략가능.
		// 값을 동시에 추가하고 싶다면
		ArrayList<Integer> num3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		ArrayList<String> vocabulary = new ArrayList<String>();
		ArrayList<Student> members = new ArrayList<Student>();

		// 클래스의 정의된 기능을 알아봐야 한다.
		// 값 추가하는 방법 CRUD 중에 C
		list.add(3);
		list.add(null);
		list.add(1, 10); // index 1위치에 10이라는 요소를 삽입, 기존 요소가 있다면 뒤로 자동 이동
		System.out.println("값 추가 확인 : " + list); // --> 주소값이 안 나오고 null이 끝에 나오는 이유. toString이 반영되어 있다.
		Student student = new Student("00학교 학생");
		System.out.println(student);

		// 값 삭제 CRUD 중에 D
		list.remove(2);
		System.out.println("값 삭제 확인 : " + list);
		// 전체삭제
//		list.clear();
		System.out.println("전체 삭제 확인 : " + list);

		// 리스트 사이즈 확인
		System.out.println(list.size()); // <== 요소 개수, 사이즈 개념

		// 하나의 요소를 꺼내는 방법
		try {
			System.out.println(list.get(0));
		} catch (Exception e) {
			System.out.println("프로그램이 종료되지 않게 처리");
		}

		// ArrayList와 반복문에 활용
		nums = list; // 복사개념 필수!! 얕은 복사 개념!!!!
		System.out.println(list);
		System.out.println("======================");
		list.add(1000);
		System.out.println(nums);
//		for (Integer i : list) {} // <--list는 컴파일 시점에 Object타입으로 인식.
		for (Integer i : nums) {
			System.out.println("i : " + i);
		}

		// ArrayList 안에 값이 포함되어 있는가 확인
		System.out.println("3이 nums 리스트에 존재하는가?\t" + nums.contains(3));
		System.out.println("500이 nums 리스트에 존재하는가?\t" + nums.contains(500));

		// 요소의 위치(index)확인
		System.out.println("요소 3이 몇 번째 인덱스에 위치하는가?\t" + nums.indexOf(3));
		System.out.println("요소 500이 몇 번째 인덱스에 위치하는가?\t" + nums.indexOf(500));

		// Iterator 요소 순회 (반복자)
//		Iterable<Iterable> iter = nums.iterator();
//		while (iter.hasNext()) {
//			System.out.println("while을 활용하는 방법 : " + iter.next());
//		}

		// 배열, ArrayList
		// 배열은 더 빨리 찾을 수 있다. ArrayList는 유도적으로 늘어났다 줄었다 가능하니 그럴때 사용.

	} // end of main

} // end of class
