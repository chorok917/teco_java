package basic.ch13;

import java.util.Random;

public class LottoNumberMaker {

	//멤버 변수
	private String version = "1.0.0";
	
	//함수
	public static void main(String[] args) {
		
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		
	}//end of main
	
	//인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		//static 함수 안에 멤버 변수를 사용할 수 없다.
		//메모리가 뜨는 순서를 알면 이해할 수 있다.
//		System.out.println("ver : " + version);
		//자바 도구 -- 표준 API
		//난수 발생기 -> 랜덤 값(번호,문자)을 생성
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1; //0 ~~ 44까지 랜덤으로 번호를 만들어준다.
		
		return resultNumber;
	}
	
}
