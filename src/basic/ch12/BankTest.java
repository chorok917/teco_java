package basic.ch12;

public class BankTest {

	public static void main(String[] args) {

		Bank bank1 = new Bank("111-111");
		
		System.out.println(bank1.getBank() + bank1.getAccount());
		
		Bank bank2 = new Bank("2222-2222");
		
		System.out.println(bank2.getBank() + bank2.getAccount());
		
	}//end of main

}//end of class
