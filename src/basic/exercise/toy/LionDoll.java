package basic.exercise.toy;

public class LionDoll extends ToyMarchine {

	int stock = 1;

	public void getProducts() {
		System.out.println(" 뽑기 성공");
		stock -= 1;
		if(stock == 0) {
			System.out.println("재고부족");
		}
	}
	
	public void checkStock() {
		System.out.println("사자 인형 재고 : " + stock);
	}

}
