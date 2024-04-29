package useful;

public class EBook {

	private int bookTypeId;
	private String title;
	private String author;

	public EBook(int bookTypeId, String title, String author) {
		this.bookTypeId = bookTypeId;
		this.title = title;
		this.author = author;
	}

	// Object 클래스에 있는 메서드를 재정의
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof EBook) {
			// 1. EBook 클래스의 인스턴스가 맞다면
			EBook tbook = (EBook) obj;
			// 2. EBook 의 제목과 저자의 이름이 같다면 true를 반환 시켜라.
			if (this.title.equals(tbook.title)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// 코드 테스트
	public static void main(String[] args) {
		EBook book1 = new EBook(1, "홍길동전", "허균");
		EBook book2 = new EBook(1, "홍길동전", "허균");
		System.out.println("--------------------------------------------------");

		// 주소값 비교
		boolean result1 = book1 == book2;
		System.out.println("result : " + result1);

		// 제목 비교
		boolean result2 = book1.equals(book2);
		System.out.println("result2 : " + result2);
	}

}
