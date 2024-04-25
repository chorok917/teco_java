package basic.exercise.toy;

public class BearDoll extends ToyMarchine {

	int stock = 7;

	public void getProducts() {
		System.out.println( " 뽑기 성공");
		stock -= 1;
	}
	
	public void checkStock() {
		System.out.println("곰 인형 재고 : " + stock);
	}
}
