package operator.unary;

/**
 * 단항연산자 : 증감연산자 (++, --) 를 테스하는 클래스
 * 증감연산자의 위치에 따른 값의 변화를 확인
 * ---------------------------------------------------
 * 변수 앞에 쓰이면 증가된 값이 결과로 사용되며
 * 변수 뒤에 쓰이면 증가되기 전의 값이 결과로 사용됨.
 * @author PC38206
 *
 */
public class PrePost {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int count = 0;
		
		// 3. 사용
//		System.out.println(++count); 
//		System.out.println(count++);
//		System.out.println(--count);
//		System.out.println(count--);
		
		System.out.println("변경 값  ,  변경 후 값");
		System.out.println(++count + ", " + count); 
		System.out.println(count++ + ", " + count);
		System.out.println(--count + ", " + count);
		System.out.println(count-- + ", " + count);

	}

}















