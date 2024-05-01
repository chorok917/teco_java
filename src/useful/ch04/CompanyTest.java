package useful.ch04;

public class CompanyTest {

	public static void main(String[] args) {

//		Company company = new Company(); // <-- 생성 불가
		// 고민! Company 객체를 어떻게 접근할 수 있을까?
		// A 클래스에서 활용한다고 가정
		Company company = Company.getInstance();
		System.out.println(company);

		// B 클래스에서 활용한다고 가정
		Company company2 = Company.getInstance();
		System.out.println(company2);
		
		// 힙메모리에 컴퍼니라는 객체는 단 하나만 존재한다.
		// 다른 곳에서 호출하더라도 이 객체 하나만 바라보게 되는 것이다.
		
	} // end of main

} // end of class
