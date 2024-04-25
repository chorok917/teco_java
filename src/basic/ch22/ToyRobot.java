package basic.ch22;

public class ToyRobot implements RomoteController, SoundEffect {

	int width;
	int height;
	String color;

	// turnOn
	// turnOff
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
	};

	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
	}

	@Override
	public void soundOn() {
		System.out.println("멍멍");
	};

}
