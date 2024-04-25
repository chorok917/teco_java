package basic.ch18;

public class Computer {

	private CPU cpu;
	private String name;
	
	public Computer() {
		cpu = new CPU(); //composition관계
		cpu.setName("인텔10");
	}

	void start() {
		System.out.println("컴퓨터가 시작됩니다.");
		cpu.process();
	}
	
	//필요하다면 setter 메서드를 만들 수 있다.
	//외부에서 주입받을 수 있다.
	
	public void setCPU(CPU cpu) {
		this.cpu = cpu;
	}
	
	//외부에서 접근 가능한 setter
	public CPU getCPU() {
		return cpu;
	}
}
