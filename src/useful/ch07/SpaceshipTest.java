package useful.ch07;

import useful.ch07.Spaceship.Engine;

public class SpaceshipTest {

	public static void main(String[] args) {

		Spaceship spaceship = new Spaceship();
		spaceship.startSpaceShip();
		// 외부에서 엔진을 만들어서 spaceship에 주입 시켜야 한다.

		Engine 누리호1번엔진 = new Engine();
		Engine 누리호2번엔진 = new Spaceship.Engine();
		Engine 누리호3번엔진 = new Spaceship.Engine();
		// 변수명은 한글로 작성하지 않는다!!
		System.out.println("------------------");
		spaceship.addEngine(누리호3번엔진);
		spaceship.startSpaceShip();

		// 굳이 내부 클래스를 사용하지 않아도 되지만
		// 그 이유를 설명하자면
		// 논리적인 그룹화가 목적이다.
		// 정적 내부 클래스는 독립적으로 존재할 수 있고 밖으로 뺄 수 있지만
		// 외부 클래스와 논리적으로 관련 있는 클래스들을 그룹화 하는데 유용하다.
	}

}
