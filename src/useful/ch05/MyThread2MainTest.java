package useful.ch05;

public class MyThread2MainTest extends Thread {

	// 메인 작업자 하나 있는 상황
	public static void main(String[] args) {
		System.out.println("main start");

		// 문제!
		// MyThread2를 메모리에 올리고
		// 그 안에 정의된 run() 메서드를 호출하시오
		// 힌트 --> Thread 문서를 반드시 확인하시오.
		MyThread2 thread2 = new MyThread2();
		// thread2.run(); <-- 일반 메서드 호출일 뿐이다! Thread에 start()해서 run()실행되는 거랑 다르다.
		// 이걸 생성했으면서 thread가 돌아간다고 생각하면 안된다.

		// 새로운 작업자를 생성해서 위임 시킬때는 Thread 안에 있는 start() 메서드를 호출해야 된다.
		Thread thread = new Thread(thread2);
		thread.start();
		// 결국 다른 작업자에게 일을 위임하려면 쓰레드에 start()를 호출해야 한다.

		System.out.println("---end main thread---");

	} // end of main

} // end of class
