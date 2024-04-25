package basic.ch20;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("-----------------");

		Animal animal2 = new Tiger();
		animal2.move();
		animal2.eating();
		System.out.println("-----------------");

		Animal 주소3 = new Human();
		System.out.println(주소3);
		주소3.move();
		주소3.eating();
		((Human)주소3).readBooks(); //다운캐스팅
	}// end of main

}// end of classF
