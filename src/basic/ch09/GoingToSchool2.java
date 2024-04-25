package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	// 메인 함수
	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어보자.

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행에 흐름을 만들고
		// 2번을 누르면 지하철을 태우는 실행의 흐름을 만들어봅시다.
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("티모", 100_000);

		Scanner sc = new Scanner(System.in);
		int transit;
		int busNum;
		int subwayNum;

		while (true) {

			System.out.println("\n1. 버스 2. 지하철 0.종료");
			System.out.println("번호를 선택 : ");
			transit = sc.nextInt();

			//start if
			if (transit == 1) {

				System.out.println("\n몇 번 버스에 탑승하시겠어요?");
				System.out.println("1. 100번 버스 2. 200번 버스");
				System.out.println("버스 번호를 선택 : ");
				
				//start busNum if
				busNum = sc.nextInt();
				if (busNum == 1) {
					s1.takeBus(bus1);
					System.out.println("100번 버스에 탑승하셨습니다.");
					bus1.showInfo();
					break;
				} else if (busNum == 2) {
					s1.takeBus(bus2);
					System.out.println("200번 버스에 탑승하셨습니다.");
					bus2.showInfo();
					break;
				} else {
					System.out.println("버스 번호를 제대로 입력하세요.");
				}//end of if

			} else if (transit == 2) {

				System.out.println("\n몇 호선에 탑승하시겠어요?");
				System.out.println("1. 1호선 2. 2호선");
				System.out.println("지하철 노선 선택 : ");

				//start subwayNum if
				subwayNum = sc.nextInt();
				if (subwayNum == 1) {
					s2.takeSubway(subway1);
					System.out.println("1호선에 탑승하셨습니다.");
					subway1.showInfo();
					break;
				} else if (subwayNum == 2) {
					s2.takeSubway(subway2);
					System.out.println("2호선에 탑승하셨습니다.");
					subway2.showInfo();
					break;
				} else {
					System.out.println("지하철 노선을 제대로 입력하세요.");
				}//end of if
				
			} else if(transit == 0) {
				System.out.println("종료하겠습니다.");
				break;
			} else {
				System.out.println("교통수단을 제대로 선택하세요.");
				continue;
			} // end of if

			

		} // end of while

	}// end of main

}// end of class
