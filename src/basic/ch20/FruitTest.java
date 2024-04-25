package basic.ch20;

public class FruitTest {

	public static void main(String[] args) {

		// 다형성
		// 다양한 형태로 클래스(데이터 타입)를 바라볼 수 있다.

		Fruit fruit1 = new Banana(); // 업캐스팅된 상태 - 부모의 데이터 타입으로 자식의 주소 값을 할당한 상태
		Fruit fruit2 = new Peach();

		fruit1.showInfo();
		fruit2.showInfo();

		System.out.println("-----------------");

		// 장점 - 다형성을 사용하면 코드를 유연하게 작성할 수 있다.
		Fruit banana1 = new Banana();
		Fruit peach1 = new Peach();
		Fruit peach2 = new Peach();

		// 배열
		Fruit[] fruits = new Fruit[3];
//		fruits[0] = fruit1;
//		fruits[1] = fruit2;
		fruits[0] = banana1;
		fruits[1] = peach1;
		fruits[2] = peach2;

		System.out.println("-------------------");
		// fruits[0] --> 바나나
		// 바나나 속성인 origin을 출력하시오.
		// 바나나 기능인 saleBanana() 메서드를 호출하시오.
		System.out.println(((Banana) fruits[0]).origin);
		((Banana) fruits[0]).saleBanana();

		// 내가 적은 답 --->
		// Banana banana = (Banana)banana1;
//		banana.origin;
//		((Banana)banana1).saleBanana();

		System.out.println("-------------------");
//배열은 반복과 함께 많이 사용한다.
		// 0 --> 바나나
		// 1 --> 복숭아
		// instanceof 연산자를 알아야 해결 가능
		// instanceof ---> 실행 시점에 객체가 특정 클래스의 인스턴스인지 확인하는 키워드
		for (int i = 0; i < fruits.length; i++) {
			//방어적 코드
			if (fruits[i] instanceof Banana) {
				((Banana) fruits[i]).saleBanana();
			} else {
				fruits[i].showInfo();
			}
		}
	} // end of main

} // end of class
