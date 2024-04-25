package basic.exercise.toy;

//클래스 - 인형 뽑기
//상품들이 존재 가능
//사자인형, 곰인형, 에어팟 -
//조건 - 배열을 활용해서 객체들을 담아주세요.

public class ToyMarchine {

	private Products[] products;

	// 사용자 정의 생성자
	public ToyMarchine() {
		products = new Products[30];
	}

	// 사장이 상품을 넣다
	public void restock(int i) {
		products = new Products[i];
	}

	// 사용자가 돈을 넣고 게임을 한다.
	public void pick() {

	}

	// 상품 정보 출력
	void showInfo() {
		// for sys
		// 특정 상품 변수... 메서드를 insteadof 활용...
	}

	public void getProducts() {
		System.out.println(" 뽑으셨습니다.");
	}

}
