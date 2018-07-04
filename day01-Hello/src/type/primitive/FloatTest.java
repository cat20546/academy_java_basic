package type.primitive;

/**
 * 실수형 타입인 float, double 타입을
 * 테스트하는 클래스이다.
 * @author PC38206
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		// 2. 초기화
		pi1 = 3.14F;
		pi2 = 3.14;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("float pi1=" + pi1);
		System.out.println("double pi2=" + pi2);
		System.out.println("=====================");
		
		pi1 = 3.14159265357979323846F;
		pi2 = 3.14159265357979323846;
		
		System.out.println("float pi1=" + pi1);
		System.out.println("double pi2=" + pi2);

	}

}









