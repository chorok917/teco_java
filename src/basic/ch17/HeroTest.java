package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {

		Hero hero = new Hero("영웅",100);
		
		Warrior wr1 = new Warrior("김아무개",50);
		//w1 --> 참조 변수, 래퍼런스 변수라고 부른다.
		Archer ah1 = new Archer("최아무개",60);
		Wizard wi1 = new Wizard("박아무개",30);
		
		
	}//end of main

}//end of class
