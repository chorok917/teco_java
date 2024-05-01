package useful.ch04;

public abstract class DrinkBar {
	
	// methods
	void turnOn() {
		System.out.println("전원이 켜집니다.");
	}
	
	abstract void workDispenser();
	
	void turnOff() {
		System.out.println("전원이 꺼집니다.");
	}
	
	//
	final void getBeverage() {
		turnOn();
		workDispenser();
		turnOff();
	}
	
}
