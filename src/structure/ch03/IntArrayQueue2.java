package structure.ch03;

public class IntArrayQueue2 {

	private int[] array;
	private int front; // Queue 시작점
	private int rear; // Queue 끝 지점
	private int capacity; // Queue 용량
	private int size; // 요소의 개수

	public IntArrayQueue2(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어보기
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo - 1 데이터 넣기 기능 구현
	public void enqueue(int item) {
		// todo - 코드 수정
		// [10][20][30]
		// 나머지 연산자를 활용한다 (순환구조)
		// 1 = 1 % 5; 몫 0; 나머지 1;
		// 2 = 2 % 5; 몫 0; 나머지 2;
		// 임시 값 3
		// 0 = 0 % 3
		// 1 = 0 + 1 % 3;
		// 2 = 1 + 1 % 3;
		rear = (rear + 1) % capacity;
		array[rear] = item;
		size++;
	}

	// todo - 2 데이터 꺼내기
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없음");
			return -999999;
		}

		int item = array[front];
		// [10][20][30]
		front = (front + 1) % capacity;

		return item;
	}

	public void printAll() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// 코드 테스트
	public static void main(String[] args) {
		IntArrayQueue2 queue = new IntArrayQueue2(3);

		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400); // 안들어감

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		// 데이터 꺼내고 삭제 처리
//		queue.dequeue();
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
	}

} // end of class
