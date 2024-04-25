package basic.ch09;

public class GoingToSchool1 {

	//메인 함수
	public static void main(String[] args) {

		//객체지향 프로그래밍이란 객체와 객체간에 관계를 형성하고
		//상호작용하게 프로그래밍하는 것.
		
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		//집중!
		Student student1 = new Student("홍길동",10_000);
		student1.showInfo();
		//만들고 싶은 일 : 학생이 버스를 탄다.
		System.out.println("-------------------------------");
		student1.takeBus(bus2);
		student1.showInfo();
		System.out.println("================================");
		//버스 상태값 확인
		bus2.showInfo();
		System.out.println("-------------------------------");
		
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		subway2.showInfo();
		
	}//end of main

}//end of class
