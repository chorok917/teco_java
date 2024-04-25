package basic.ch11;

public class Person {

	//this의 세 가지 사용방법
	//1. this는 자기 자신을 가리킨다.(인스턴스의 주소)
	//2. 생성자에서 다른 생성자를 호출할 때 사용할 수 있다.
	//3. 자신의 주소(참조값 또는 주소값)를 반환 시킬 수 있다.
	
	//변수는 기본적으로 private로 만들기
	private String name;
	private int age;
	private String phone;
	private String gender;
	
	//1.
	//생성자
	public Person(String name, int age) {
		//자기 자신의 멤버 변수 name 외부에서 들어오는 지역 변수 name을 대입
		this.name = name;
		this.age = age;
	}
	
	//2. 
	public Person(String name, int age, String phone) {
		//생성자에서 다른 생성자를 호출할 수 있다 this(...)
		//다른 생성자를 가장 먼저 호출하고 다른 수식을 작성해야 한다.
		this(name, age);
		this.phone = phone;
	}
	public Person(String name, int age, String phone,String gender) {
		this(name,age,phone);
		this.gender = gender;
	}
	
	//3.자신의 주소값을 반환 시킬 수 있다.
//	public Person getPerson() {
//		//자신의 주소값을 반환 시킨다.
//		return this;
//	}
	
	public void showInfo(){
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	//연습문제 - setName메서드 만들기
	public void setPerson (String name) {
		this.name = name;
	}
	public String getPerson() {
		return this.name;
	}
	
}//end of class
