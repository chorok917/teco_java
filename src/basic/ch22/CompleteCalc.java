package basic.ch22;

public class CompleteCalc extends Calculator {

	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public int substract(int n1, int n2) {
		return n1 - n2;
	}

	public int times(int n1, int n2) {
		return n1 * n2;
	}

	public void showInfo() {
		System.out.println("계산완료");
	}
	
	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(10, 10));
		System.out.println(calc.divide(10, 0));
		
		((CompleteCalc)calc).showInfo();
		// 반복문, 제어문 활용한다면 instanceof 연산자를 기억하자
		if(calc instanceof CompleteCalc) {
			((CompleteCalc) calc).showInfo();
		}
	}
}
