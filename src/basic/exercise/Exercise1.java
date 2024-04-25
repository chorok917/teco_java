package basic.exercise;

public class Exercise1 {

	//코드의 시작점(main 함수)
	public static void main(String[] args) {

		// 1.
		int data1 = 10; // 변수에 선언과 동시에 초기화(값을 넣다)
		int data2 = 100;
		int data3 = 100;
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		// 2.
		int ageBox; 
		ageBox = 20;
		
		System.out.println(ageBox);
		
		// 2-1.
		// 이전 값은 어떻게 찾아오지? 
		// 값이 사라지지 않게 하기 위해서는 메모리 상자를 하나 더 만들어서
		// 넣어두면 된다.
		int oldBox = ageBox;
		ageBox = 30;
		
		System.out.println("ageBox : " + ageBox);
		System.out.println("oldBox : " + oldBox);
		
		// 3.
		int a = 1;
		int b = 3;
		int temp = a;
		
		a = b;
		b = temp;
		
		System.out.println(b);
		
	} // end of main

} // end of class
