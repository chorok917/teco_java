package basic.exercise;

import java.util.Scanner;

public class Exercise4 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 사용자한테 값을 입력받게 하려면
		Scanner sc = new Scanner(System.in);

		// \n --> 시작할 때 무조건 한줄 내림
		System.out.println("\n메뉴 선택");
		System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
		System.out.print("선택 : ");

		int choice;
		choice = sc.nextInt();
		boolean flag = true;

		// 만약 사용자가 1을 선택했다면
		while (flag) {
			if(0 <= choice && choice < 5) {		
				System.out.println("\n메뉴 선택");
				System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
				System.out.print("선택 : ");
				
				if (choice == 1) {
					System.out.println("등록을 선택했습니다.");
				} else if (choice == 2) {
					System.out.println("조회를 선택했습니다.");
				} else if (choice == 3) {
					System.out.println("수정을 선택했습니다.");
				} else if (choice == 4) {
					System.out.println("삭제를 선택했습니다.");
				} else {
					System.out.println("프로그램을 종료합니다.");
					flag = false;
				}
			}else {
					System.out.println("잘못 선택하셨습니다.");
				}
			
		} // end of while

		
		
	} // end of main
} // end of class
