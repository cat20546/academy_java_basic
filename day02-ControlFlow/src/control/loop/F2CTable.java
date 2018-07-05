package control.loop;

/**
 * 화씨온도 (F) -> 섭씨온도(C)로 변환
 * 
 * 변환 공식 : C = 5 / 9 * (F - 32)
 * 
 * 화씨온도 0.0도에서 10도씩 증가시키면서 100.0도까지 계산
 * 
 * 화씨온도 변수 : fah
 * 섭씨온도 변수 : cel
 * 
 * for 구문구조 사용
 * @author PC38206
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		// 1. 선언
		double fah;
		double cel;
		
		// 초기값 상수 선언, 초기화
		final int FROM = 0;
		// 종료값 상수 선언, 초기화
		final int TO = 100;
		// 증가값 상수 선언, 초기화
		final int STEP = 10;
		
		// 3. 사용
		for (fah = FROM; fah <= TO; fah += STEP) {
			cel = 5.0 / 9.0 * (fah - 32);
			System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
		}
		
		System.out.printf("최종 fah=%5.1f", fah);
		
	}

}









