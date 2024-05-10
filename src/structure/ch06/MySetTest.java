package structure.ch06;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MySetTest {

	public static void main(String[] args) {

		// 계층구조 확인
		// 업캐스팅 상태 - 컴파일 시점에는 Set계열에 타입은 멤버들만 확인 가능
		Set<Integer> mSet = new HashSet<Integer>();

		HashSet<Integer> set1 = new HashSet<Integer>();

		// 요소 추가 방법
		set1.add(1);
		set1.add(1); // 중복값 발생
		set1.add(2);
		set1.add(3);
		set1.add(3); // 중복값 발생

		// Set은 중복값을 처리하지 않는다. 덮어쓴다.
		System.out.println(set1.size()); // 사이즈 확인

		// 요소 제거 (요소 -> 값을 넣음)
		set1.remove(3);
		System.out.println(set1);

		// Set 계열은 순서를 보장하지 않음
		for (int i = 0; i < set1.size(); i++) {
			// 횟수만큼 반복은 한다.
//			set1[i] ==> set 계열은 인덱스 개념이 없다.
		}

		for (Integer mI : set1) {
			System.out.println("요소 값 추출 : " + mI);
		}

		// 반복자를 활용해서 요소 순회를 할 수 있다.
//		HashSet<Integer> iter = (HashSet<Integer>) set1.iterator(); 
//		while (set1.size() < 10) {
////			 set에 어떻게 접근하지??
//		}

//		while(((Iterator<Integer>) iter).hasNext()) {
//			System.out.println("값 확인 : " + ((Iterator<Integer>) iter).next());
//		}

		System.out.println("---------------------");

		// getRandomNumber() 메서드가 호출되면 데이터를 관리하고자 한다.
		HashSet<Integer> lottoNumbers = new HashSet<Integer>();

		int whileCount = 0;
		while (lottoNumbers.size() < 6) {
			lottoNumbers.add(getRandomNumber());
			whileCount++;
		}

		System.out.println(lottoNumbers);
		System.out.println("반복 횟수 : " + whileCount);
	} // end of main

	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}

} // end of class
