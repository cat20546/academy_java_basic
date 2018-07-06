package array.init;

/**
 * 참조형의 대표 타입인 String 을 저장하는 
 * 배열을 선언하고 초기화 후
 * 참조형의 기본값으로 초기화된 각 원소를 확인한다.
 * 
 * @author PC38206
 *
 */
public class StringArrayInit {

	public static void main(String[] args) {
		// 1. 선언
		String[] names;		
		
		// 2. 초기화
		names = new String[10];
		
		// 3. 사용
		for (String name: names) {
			System.out.printf("name=%s%n", name);
		}
		
		for (int idx = 0; idx < names.length; idx++) {
			System.out.printf("names[%d]=%s%n", idx, names[idx]);
		}

	}

}






