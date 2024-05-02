package structure;

public class MainTest1 {

	public static void main(String[] args) {

		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		// tencoIntArray.insertElement(5, 50); // 테스트 이후에 수정 - todo
		// System.out.println(tencoIntArray.getElement(0));
		tencoIntArray.printAll();

		System.out.println("=====================");

		System.out.println("배열길이를 출력 : " + tencoIntArray.getCountSize());
		System.out.println("배열이 비어있는지 확인 : " + tencoIntArray.isEmpty());
		tencoIntArray.removeAll();
		tencoIntArray.printAll();

	}

}
