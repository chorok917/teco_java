package basic.ch04;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		
		// 특정 조건일 때 반복문을 종료시켜 보자.
		boolean flag = true; // 깃발을 꽂는 느낌. 여기까지.
		int start = 1;
		int end = 3;
		
		while (flag) {
			if(start == end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return;
			}
			
			System.out.println("start : " + start);
			
			start++;
			
		} // end of while	
		
	} // end of main
	
} // end of class
