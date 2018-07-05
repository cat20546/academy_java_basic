package control.loop;

/**
 * 1 ~ 100 사이의 짝수의 합을 계산하는 클래스
 * while 을 활용
 * @author PC38206
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int number = 0;
		int sum = 0; 
		
		// 3. 사용
		while (number <= 100 ) {
			sum += number;
			number += 2;
		}
		
		// 다른 풀이
		number = 1;
		sum = 0;
		while (number <= 100) {
			if ((number % 2) == 0) {
				sum += number;				
			}
			number++;
		}
		
		System.out.printf("1 ~ 100 사이의 짝수의 합 : %d%n", sum);

	}

}









