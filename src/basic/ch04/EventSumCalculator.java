package basic.ch04;

import java.util.Scanner;

public class EventSumCalculator {

	// start of main
	public static void main(String[] args) {

		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요.");
		int maxNumber = sc.nextInt();
		// 1 <--    10   -> 2 + 4 + 6 + 8 + 10;
		int sum = 0;
		
		// 반복적인 패턴이 확인된다.
		// 가상의 값 10이라고 가정했을 때
		// 몇 번 반복하나? 10번 반복한다.
		for(int i = 2; i <= maxNumber; i += 2) {
			// 1 = 0 + 1;
			// 3 = 1 + 2;
			// 6 = 3 + 3;
			sum += i;
			System.out.print("sum : " + sum + " \n ");
			
		} // end of for
		
		System.out.println("sum : " + sum);
		
		
		
	} // end of main

} // end of class
