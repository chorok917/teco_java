package useful.ch03;

public class ThrowsHandling {

	// main thread
	public static void main(String[] args) {

		Calc calc = new Calc();
		try {
			// 던져서(throw) 강제성이 발생되고 사용하는 사람이 직접 에외처리 핸들링을 할 수 있다.
			calc.divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("어떤 수를 0으로 나눌 수 없어요.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Exception을 마지막에 넣어야 한다. 예외 중에서 가장 상위라서.
		// 예외를 일일이 처리할 수도 있지만 사용자마다 예외가 다르다면 던져야한다.
		Exception exception;

	} // end of main

} // end of classF

class Calc {

	public int divide(int n1, int n2) throws Exception {
		// 사용자가 0을 입력하면 예외가 발생될 수 있는 코드영역이다.
		// 해결방법
		// 1. 해당 메서드에서 직접 예외 처리를 구현한다.
		// 2. 사용하는 사람이 직접 예외 처리를 할 수 있도록 던져버린다.
		return n1 / n2;
	}

}