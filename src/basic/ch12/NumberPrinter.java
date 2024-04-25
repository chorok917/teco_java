package basic.ch12;

//번호 뽑는 기계
public class NumberPrinter {

	private int id; // 기계 개수
	public static int waitNumber; // 대기번호 (중복X)

	// private int waitNumber --> 멤버 변수(클래스 안에 있는 변수)
	// static 변수 --> Method Area 영역에 올라간다.
	// 즉 static waitNumber 변수는 NumberPrinter 인스턴스화 되기 전에 사용가능하다.

	// 사용자 정의 생성자 --> 번호표 출력 기계
	public NumberPrinter(int id) {
		this.id = id; // 기계 번호
		waitNumber = 1; // 시작하는 대기번호 숫자
	}

	// 메서드(기능) --> 번호표를 출력한다.
	public void printWaitNumber() {
		System.out.println(id + "번 기기의 대기 순번은 " + waitNumber);
		waitNumber++;
	}

}
