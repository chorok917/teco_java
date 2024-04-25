package basic.exercise.test01;

public class MainTest1 {

	public static void main(String[] args) {

		// 문제1
		A a = new A();
		// a 참조변수로 시작해서 D에 name 값을 화면에 출력하시오.
		// 단 여기서는 A객체만 생성해야 합니다.

		System.out.println(a.b.c.d.getName());

		a.b.c.d.setName("두 번째 이름");
		System.out.println(a.b.c.d.getName());

	}// end of main

}// end of class
