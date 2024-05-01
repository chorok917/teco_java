package useful.ch04;

public class DrinkBarTest {

	public static void main(String[] args) {

		DrinkBar drinkCola = new CocaCola();
		DrinkBar drinkSprite = new Sprite();
		
		drinkCola.getBeverage();
		System.out.println("=======================");
		drinkSprite.getBeverage();

	} // end of main
} // end of class
