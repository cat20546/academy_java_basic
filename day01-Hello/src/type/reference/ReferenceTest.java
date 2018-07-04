package type.reference;

/**
 * 기본형 8가지 외의 모든 타입인
 * 참조형 타입을 테스트하는 클래스이다.
 * 
 * 참조형의 대표격인 String(문자열) 타입으로
 * 테스트를 해보자.
 * @author PC38206
 *
 */
public class ReferenceTest {

	public static void main(String[] args) {
		// 1. 선언 : 타입 변수이름;
		//    선언할 때, 타입에 기본형 8가지가 
		//    아닌 이름이 오면 무조건 참조형
		//    ==> 변수 칸에는 화살표가 저장되고
		//        진짜 값은 다른 곳에 존재하는 타입
		String name; 
		
		// 2. 초기화
		name = "채한나";
		
		// 3. 사용
		System.out.println("name=" + name);

	}

}










