package basic.exercise.test02;

public class MainTest1 {

	public static void main(String[] args) {

		// 문제2
		// 각 클래스 내부(A,B,C,D)에서 객체를 생성하지 않고
		// 외부에서 객체를 주입한 후 D에 getName()호출 하시오.

		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();

		// 메서드 의존 주입
		a.setB(b);
		b.setC(c);
		c.setD(d);

		System.out.println(a.getB().getC().getD().getName());

	}// end of main

}// end of class
