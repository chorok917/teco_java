package starcraft.ver02;

public class GateWay {

	private int gateWayNumber;
	private int count;
	
	//기능 - 질럿 생산하는 기능을 만들어보세요.
	
	//생성자
	public GateWay(int gateWayNumber) {
		this.gateWayNumber = gateWayNumber;
		count = 0;
	}
	
	public int getCount() {
		return count;
	}

	public int getGateWayNumber() {
		return gateWayNumber;
	}
	
	//Zealot을 리턴하는 것
	public Zealot createZealot(String name){
		count++;
		return new Zealot(name);
	}
	
	//marine 을 리턴하기
	public Marine createMarine(String marineName) {
		count++;
		return new Marine(marineName);
	}
	
	//zergling 을 리턴하기
	public Zergling createZergling(String zerglingName) {
		count++;
		return new Zergling(zerglingName);
	}
	
}//end of class
