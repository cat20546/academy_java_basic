package control.loop;

/**
 * 0 ~ 10까지 출력하는 클래스
 * 
 * while 구문을 사용하여 
 * 반복 출력으로 구현한다.
 * 
 * @author PC38206
 *
 */
public class PrintToTen {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int number = 0;
		
		// 3. 사용
		while (number <= 10) {
			System.out.printf("number = %d%n", number);
			number++;
		}
	}
}









