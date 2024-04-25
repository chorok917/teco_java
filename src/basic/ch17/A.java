package basic.ch17;

//상상력 추가해보기
//선임이 작성한 코드라고 가정한다.
public class A {

	String name;
	int height;
	int weight;
	int age;

	// 잘 돌아가는 코드를 바로 수정하게 된다면....
	// 기존에 돌아가는 것과 새로 추가한 것이 충돌할 수도 있다.

}

//단, 작업 파일 한 개 안에 클래스 여러 개를 작성할 수 있다.
//단, public 클래스는 오직 하나만 정의 가능하다.

//만약 상속을 배우지 않았다면 복사 붙여넣기도 방법이다.
class B {

	String name;
	int height;
	int weight;
	int age;

	int level;
	String nickName;

}

//그러나 상속이라는 문법을 배운 개발자라면....
//'extends 클래스 이름'으로 상속 받을 수 있다.
//상속은 기능적으로 확장 되었냐에 따라 크기가 크다고 말할 수 있기 때문에
//자식 클래스(=서브클래스)가 부모 클래스(=슈퍼클래스)보다 크다.
//private가 아니라면 모두 물려받을 수 있다. 보이지는 않지만 물려받은 것이 맞다.
class C extends A {

	int level;
	int nickName;
	String phone;

}
