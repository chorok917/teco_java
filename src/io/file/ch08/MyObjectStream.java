package io.file.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream, ObjectInputStream 
public class MyObjectStream {

	public static void main(String[] args) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
			Person person = new Person("손흥민", 30);
			oos.writeObject(person);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("-----------------");

		// 객체 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
			// 문자기반으로 데이터를 읽으면 하나하나 스트링 값을 추출해야 한다
			// 그리고 코드상에 잘 활용할 수 잇도록 오브젝트 만드는 코딩을 해야 한다.
			// 문자기반으로 읽었다는 건 name ; 30 ; 일일히 끊어 읽는 것.
			// 오브젝트로 만들었으면 오브젝트를 끌고 올 수 있다.
			Person person = (Person) ois.readObject();
			System.out.println(person);
		} catch (Exception e) {
			e.printStackTrace(); // 예외 처리 흐름 생성 가능
		}

	} // end of main

} // end of class
