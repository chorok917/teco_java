package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {

		Person person1 = new Person("홍길동", 100);
		Person personBox = person1;
		//Person personBox2 = person1.getPerson();
		
		Person personLee = new Person("이순신", 101);
		System.out.println("---------------------------");
		//위 코드까지는 heap메모리 영역에 객체가 2개 생성된 상태이다.
		//지역 변수인 person1과 personBox와 personBox2는 같은 객체를 가리킨다.
		
		//연습문제 -setName 메서드 만들기
		person1.setPerson("티모");
		person1.showInfo();
		
		System.out.println(person1.getPerson());
		
		
	}//end of main

}//end of class
