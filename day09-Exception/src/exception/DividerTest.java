package exception;

import java.util.Scanner;

/**
 * 입력값에 따라 0으로 나누는 상황이 발생할 수 있는
 * Divider 클래스를 테스트한다.
 * 
 * 테스트 과정에서 DivideZeroException을 
 * try ~ catch 구문으로 처리한다.
 * 
 * @author PC38206
 *
 */
public class DividerTest {

	public static void main(String[] args) {
		// 1. 선언
		Scanner scan;
		int input;
		Divider div;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		input = scan.nextInt();
		
		div = new Divider();
		
		// 3. 사용
		try {
			int result = div.divide(input);
			System.out.printf("나눗셈 성공:	%d%n", result);
			
		} catch (DivideZeroException e) {
			System.err.printf("나눗셈 실패: %s%n", e);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");
	}

}












