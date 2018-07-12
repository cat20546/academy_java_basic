package api.collection;

import java.util.HashSet;
import java.util.Set;

import api.object.Product;

/**
 * 객체를 요소(Element)로 저장하는 
 * 컬렉션(Collection) 중에서
 * 
 * 1. 중복을 비허용
 * 2. 순서 상관없음
 * 
 * 으로 저장하는 Set 타입을 테스트한다.
 * @author PC38206
 *
 */
public class SetTest {

	public static void main(String[] args) {
		// 1. Set 선언
		Set set;
		
		// 2. Set 초기화 : Set 인터페이스 구현클래스인
		//                 HashSet 으로 생성
		set = new HashSet();
		
		// 3. 사용
		// (1) 셋에 아이템 추가
		System.out.println(set.add("1st Item"));
		System.out.println(set.add(2));
		System.out.println(set.add(new Double(3.0)));
		System.out.println(set.add(new Boolean(true)));
		
		// 사용자 정의 타입 객체도 추가
		Product product = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		System.out.println(set.add(product));

		// 동일한 데이터 추가 시도
		System.out.println("=== 동일한 데이터 추가 시도 ===");
		System.out.println(set.add("1st Item"));
		
		// (2) set 내용 출력
		System.out.println("=== set의 내용 출력 ===");
		System.out.println(set);
		
		System.out.println("=== foreach 로 출력 ===");
		for (Object obj: set) {
			System.out.println(obj);
		}
		
	}

}








