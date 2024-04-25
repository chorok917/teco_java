package basic.ch05;

public class OrderProgram {

	public static void main(String[] args) {

		Order order1 = new Order();		
		Order order2 = new Order();		
		
		order1.customerName = "가나다";
		order1.customerAddress = "부산광역시";
		order1.customerPhone = "010-1234-5678";
		
		order1.productName = "코코넛밀크";
		order1.productCounts = 2;
		
		System.out.println(order1.customerName);
		System.out.println(order1.customerAddress);
		System.out.println(order1.customerPhone);
		
		System.out.println(order1.productName);
		System.out.println(order1.productCounts);
	}

}
