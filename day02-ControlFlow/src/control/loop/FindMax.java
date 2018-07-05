package control.loop;

import java.util.Scanner;

/**
 * 입력된 자연수 중 최댓값을 찾는 클래스
 * 
 * do ~ while 을 활용
 * 
 * @author PC38206
 *
 */
public class FindMax {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		int max;
		
		Scanner scan;
		
		// 2. 초기화
		max = 0;
		scan = new Scanner(System.in);
		
		
		// 3. 사용
		do {
			System.out.println("양수를 입력(끝내려면 0입력)");
			input = scan.nextInt();
			
			if (input > max) {
				max = input;
			}
			
		} while (input > 0);

		System.out.printf("최댓값은 %d 입니다. %n", max);
	}

}





