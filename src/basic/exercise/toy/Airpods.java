package basic.exercise.toy;

public class Airpods extends ToyMarchine {

	int stock = 2;

	public void getProducts() {
		System.out.println(" 뽑기 성공");
		stock -= 1;
	}
	
	public void checkStock() {
		System.out.println("에어팟 재고 : " + stock);
	}
}
