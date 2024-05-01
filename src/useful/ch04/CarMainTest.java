package useful.ch04;

public class CarMainTest {

	public static void main(String[] args) {

		Car aiCar = new AICar(); // 다형성, 업캐스팅된 상태
		aiCar.run();
		
		System.out.println("------------------");
		
		Car manualCar = new MenualCar();
		manualCar.run();
		
	} // end of main

} // end of class
