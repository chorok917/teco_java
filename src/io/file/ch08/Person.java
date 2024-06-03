package io.file.ch08;

import java.io.Serializable;

// 특정 클래스를 직렬화하기 위해서는 상위 부모 또는 바로 Serializable 구현해야 한다. 
// 직렬화 시킬 때 바이트 단위로 변환 할 수 있음을 알리기 위한 공식 약속이다.
public class Person implements Serializable {

	// 버전 구분하기 위해 관성적으로 넣어준다.
	private static final long serialVersionUID = 1L; // 직렬화 버전 UID
	private String name;
	private int age;

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

} // end of class
