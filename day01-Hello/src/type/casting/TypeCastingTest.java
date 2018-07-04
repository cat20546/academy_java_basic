package type.casting;

/**
 * 숫자형 데이터 사이에
 * 형 변환(type casting)을 
 * 테스트하는 클래스이다.
 * @author PC38206
 *
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double pi = 3.14159265357979323846;
		int	number = 100;
		int result;
		
		// (타입)피연산값; <== 피 연산값을 강제 형변환 구문
		result = number + (int)pi;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("double pi=" + pi);
		System.out.println("int number=" + number);
		System.out.println("int result=" + result);
		
	}

}






