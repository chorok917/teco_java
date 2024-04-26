package useful;

public class StringTest2 {

	public static void main(String[] args) {

		String str3 = "abc";
		String str4 = "abc";

		System.out.println(str3); // 주소값 나와야하는데 toString Override되어 있어서 값이 나온다.
		System.out.println(System.identityHashCode(str3)); // 원시 코드로 올라가서 str3의 주소값 나오도록 한 것.
		System.out.println(System.identityHashCode(str4)); // 똑같은 abc니까 똑같은 주소값이 나온다.
		
		str3 = str3 + ":def";
		System.out.println(System.identityHashCode(str3)); // 원시 코드로 올라가서 str3의 주소값 나오도록 한 것.
		//리터럴 타입으로 생성한 String은 한 번 생성하면 불변이다.
		
		

	}// end of main

}// end of class
