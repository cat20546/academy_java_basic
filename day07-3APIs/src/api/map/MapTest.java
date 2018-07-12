package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import api.object.Product;

/**
 * 데이터를 key, value 를 쌍으로 저장하는 자료구조인
 * Map 을 테스트 하는 클래스
 * 
 * key   : 중복 허용하지 않음
 * value : 중복 허용함
 * 
 * key, value : 모든 타입의 데이터 저장 가능
 * @author PC38206
 *
 */
public class MapTest {

	public static void main(String[] args) {
		// 1. 선언 : Map 인터페이스
		Map map;
		
		// 2. 초기화 : HashMap 클래스
		map = new HashMap();		
		
		// 3. 사용
		// (1) map 에 데이터 추가 : put(k, v)
		map.put("1", "안녕하세요");
		map.put(2, "반가워요~");
		map.put("three", "오늘은 축구 없나요?");
		map.put(4.0, "결승 챙겨 봅시다 ㅋ");
		
		//  사용자 정의 타입 저장 가능
		Product product = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		map.put(5, product);
		
		//  (2) map 데이터 추출 : get(k)
		System.out.println(map.get("1"));
		System.out.println(map.get(5));
		
		// 전체 데이터 출력 : foreach 
		// 1. 맵의 키 전체를 먼저 얻어야 함
		// 2. 얻어진 키로 get(k) 를 반복수행
		Set keySet = map.keySet();
		for (Object key: keySet) {
			System.out.printf("key=%s : value=%s%n"
					     , key.toString(), map.get(key).toString());
		}
	}

}








