package basic.ch16;

public class Order {

	private String customerName;
	private int coffeeCount;
	private int cakeCount;
	private int cookieCount;
	
	
	public String order(String customerName) {
		this.customerName = customerName;
		return customerName;
	}
	public int order(int coffeeCount) {
		this.coffeeCount = coffeeCount;
		return coffeeCount;
	}
	public int order(int coffeeCount,int cakeCount) {
		this.coffeeCount = coffeeCount;
		this.cakeCount = cakeCount;
		return coffeeCount + cakeCount;
	}
	public int order(int coffeeCount,int cakeCount,int cookieCount) {
		this.coffeeCount = coffeeCount;
		this.cakeCount = cakeCount;
		this.cookieCount = cookieCount;
		return coffeeCount + cakeCount + cookieCount;
	}
	
}//end of class
