package basic.ch12;

public class Bank {

	static String bankName;
	String account;
	
	//생성자
	public Bank(String account) {
		this.account = account;
		bankName = "우리은행";
	}
	
	public String getBank() {
		return bankName;
	}
	public String getAccount() {
		return this.account;
	}
	
}//end of class
