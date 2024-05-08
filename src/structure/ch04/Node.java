package structure.ch04;

public class Node {

	private String data;
	// 자기 참조 관계 (셀프레퍼런스)
	// 자기 참조는 객체가 자신과 같은 타입의
	// 다른 객체를 가리키는 경우를 말한다.
	// 용도 : 연결리스트, 트리 구조에 많이 활용된다.
	public Node next;

	// 기본 생성자
	public Node() {
		data = null;
		next = null;
	}

	public Node(String data) {
		this.data = data;
		next = null;
	}

	public Node(String data, Node link) {
		this(data);
		next = link;
	}

	public String getData() {
		return data;
	}

} // end of class
