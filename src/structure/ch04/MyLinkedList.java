package structure.ch04;

public class MyLinkedList {

	// LinkedList는 head를 가지고 있다.
	private Node head; // 요소의 맨 처음을 가리킨다.
	int count; // 링크드리스트에 몇 개의 요소가 연결되어 있는 개수

	// MyLinkedList 맨 처음 생성시 노드는 없는 상태
	public MyLinkedList() {
		head = null;
		count = 0;
	}

	// 저장된 Node 갯수를 반환하는 메서드
	public int getCount() {
		return count;
	}

	// 새로운 노드(Node 클래스)를 1개 추가하는 메서드를 만들자.
	public Node addElement(String data) {
		Node createNode = new Node(data);
		if (head == null) {
			// 맨 처음 요소를 저장하는 동작
			head = createNode;
		} else {
			// 항상 요소 찾기는 head부터 시작
			Node preNode = head;
			while (preNode.next != null) {
				preNode = preNode.next;
			}
			// 핵심 코드
			preNode.next = createNode;
		}
		count++;
		return createNode; // TODO - 추후 수정
	}

	public Node removeElement(int index) {
		// 방어적 코드
		if (index >= count) {
			System.out.println("삭제할 위치 오류. 현재 리스트 개수는" + count + "입니다.");
			return null;
		}

		// 맨 앞 요소를 삭제 요청시
		// 항상 요소를 찾을 때 시작은 head부터 시작이다.
		Node tempNode = head;
		if (index == 0) {
			// 코드 시작전 모습
			// [콜리플라워][밀.주소값]--> [밀][null]
			head = tempNode.next;
			// 코드 수행 후 모습
			// [밀][null]
		} else {
			// 코드 시작전 모습 : position -> 2 이라고 가정
			// [콜리플라워][밀.주소값] -> [밀][옥수수.주소값] -> [옥수수][null]
			Node preNode = null;
			for (int i = 0; i < index; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;

		} // end of if
		count--;
		System.out.println(index + "번째 요소를 삭제했습니다.");

		return tempNode; // TODO - 추후 수정
	}

	// 전체 출력하는 기능 만들기
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if (temp != null) {
				System.out.print("-->");
			}
		}
		System.out.println();
	}

	// 지정한 위치의 노드 하나만 출력하기
	public Node getNodeByIndex(int index) {
		if (index >= count) {
			System.out.println("검색 위치 오류 - 잘못된 요청");
		}

		Node tempNode = head;
		if (index == 0) {
			return head;
		}

		for (int i = 0; i < index; i++) {
			tempNode = tempNode.next; // 다음 요소는 무조건 next에 담겨있다.
		}

		return tempNode;
	}

	// 전체 삭제 기능
	public void removeAll() {
		head = null;
		count = 0;
	}

	// 테스트 코드
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addElement("콜리플라워");
		linkedList.addElement("밀");
		linkedList.addElement("옥수수");
		linkedList.addElement("감자");

		linkedList.printAll();
		linkedList.removeElement(2);
		linkedList.printAll();
		System.out.println(linkedList.getNodeByIndex(1).getData());
		// [콜리플라워][] --> [밀][] --> [옥수수][]
//		System.out.println(linkedList.getCount());

		linkedList.removeAll();
		linkedList.printAll();

	} // end of main

} // end of class
