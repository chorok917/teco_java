package basic.ch18;

public class CarMainTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.startCar();
		car1.stopCar();
		
		//엔진의 속성이 name 변수에 값을 초기화 해보자.
		car1.engine.name = "V8";
		car1.engine.price = 4000;
		
		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price);
		
	}

}
