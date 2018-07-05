package control.loop;

/**
 * 1 ~ 10 까지 출력하는 클래스
 * for 구문구조를 사용하여 출력
 * @author PC38206
 *
 */
public class PrintToTenByFor {

	public static void main(String[] args) {
		// for (선언식; 조건식; 증감식)
		for (int idx = 1; idx <= 10; idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		System.out.println("========================");
		final int FROM = 1;
		final int TO = 10;
		
		for (int idx = FROM; idx <= TO; idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		System.out.println("=========10 ~ 1 역순 출력========");
		for (int idx = TO; idx >= FROM; idx--) {
			System.out.printf("idx=%2d%n", idx);			
		}
		
//		System.out.printf("idx=%2d%n", idx);			
		
		
		
	}
}












