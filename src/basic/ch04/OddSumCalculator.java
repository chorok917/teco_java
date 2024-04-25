package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {

		// 사용자의 입력값을 받아서 1부터 x까지 숫자에 홀수를 덧셈하고 출력하시오.
		
		Scanner sc= new Scanner (System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		// 사용자가 입력값을 받아서 = x까지.
		int maxNumber = sc.nextInt();
		
		// 출력하시오.
		int result = 0;
		
		// 1부터 = int i = 1;
		// 1부터 x까지 = i <= maxNumber;
		// 홀수를 덧셈 = i+=2
		for(int i = 1; i <= maxNumber; i+=2) {
			result += i;
			System.out.print("result : " + result + " \n ");
		} // end of for
		
		System.out.println("입력한 값까지 존재하는 홀수를 모두 더한 수는 : " + result);
		
		sc.close();
		
		
	} // end of main

} // end of class
