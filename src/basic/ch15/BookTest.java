package basic.ch15;

public class BookTest {

	public static void main(String[] args) {
		// 배열이란?
		// 연관된 데이터를 하나의 변수의 통으로 관리하고 싶다면 --> 자료구조
		// 배열을 사용할 때 반드시 크기가 지정 되어야 합니다.
		Book[] books = new Book[10];

		books[0] = new Book("플러터 UI 실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("플러터 UI 실전", "김근호");
		books[3] = new Book("플러터 UI 실전", "김근호");
		books[4] = new Book("플러터 UI 실전", "김근호");
		books[9] = new Book("홍길동전", "허균");

		// 배열은 반복문과 함께 많이 사용된다.
		// 배열에 크기와 요소어 크기는 꼭 동일한 것은 ㅇ니다.
		// System.out.println(books[3].getTitle());

		// System.out.println(books[5].getTitle()); <-- null pointer exception error

		for (int i = 0; i < books.length; i++) {
			// 방어적 코드를 작성해주어야 한다.
			if (books[i] != null) {
				System.out.println(books[i].getTitle());
				System.out.println(books[i].getAuthor());
				System.out.println("--------------------------");
			}
		} // end of for

	}// end of main

}// end of class
