package control.loop;

/**
 * 1 ~ 100 사이의 홀수의 합을 
 * for 반복문과 continue 의 조합으로 구해보는 클래스
 * @author PC38206
 *
 */
public class SumOfOdds2 {

	public static void main(String[] args) {
		// 1. 선언
		int sum;
		int idx;
		
		// 2. 초기화, 3. 사용
		for (sum = 0, idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
				// idx 가 짝수
				continue;
				// continue 가 실행되면 이하 무시
				// 반복의 처음으로 되돌아감
				// 다음 반복을 수행
			}
			sum += idx;
		}
		System.out.printf("1 ~ 100 사이 홀수의 합 : %d%n", sum);
		
		// continue 는 if ~ else 로 변경가능
		for (sum = 0, idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
				;
			} else {
				sum += idx;
			}
		}
		System.out.printf("1 ~ 100 사이 홀수의 합 : %d%n", sum);

	}

}






