package inheritance.basic.person;

/**
 * 일반적인 사람의 정보를 저장하는 클래스
 * ---------------------------------------
 * id   : String
 * name : String
 * age	: int
 * ---------------------------------------
 * @author PC38206
 *
 */
public class Person {
	
	// 1. 멤버 변수 선언부
	String id;
	String name;
	int age;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자 : 생성자 선언부를 완전히 생략하면
	//                   자동으로 기본생성자 선언이 들어가짐
	Person() {
		
	}
	
	// (2) 매개변수를 받는 생성자가 선언되고
	//     기본 생성자 선언이 누락된 경우는 자동으로 
	//     기본 생성자를 만들어주지 않음
	Person(String id) {
		this();
		this.id = id;
	}
	
	Person(String id, String name) {
		this(id);
		this.name = name;
	}

	Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}

	// 3. 메소드 선언부
	// toString() 재정의
	@Override
	public String toString() {
		return String.format("ID:%s, NAME:%s, AGE:%d"
				            , id, name, age);
	}
	
}











