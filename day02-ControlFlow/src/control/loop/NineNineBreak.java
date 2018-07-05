package control.loop;

/**
 * 구구단에서 곱셈의 결과가 50이 넘으면 중단하도록
 * break 구문을 for 반복문과 조합하여 
 * 테스트해보는 클래스
 * 
 * @author PC38206
 *
 */
public class NineNineBreak {

	public static void main(String[] args) {
		
		for (int stage = 2; stage < 10; stage++) {
			// 단의 제목을 출력
			System.out.printf("%n%d 단%n", stage);
			for (int times = 1; times < 10; times++) {
				if (stage * times > 50) {
					break;
				}
				System.out.printf("%d x %d = %d%n"
						, stage, times, stage * times);				
			}
			
		}
		
		System.out.println("=============================");
		OUT: for (int stage = 2; stage < 10; stage++) {
			// 단의 제목을 출력
			System.out.printf("%n%d 단%n", stage);
			for (int times = 1; times < 10; times++) {
				if (stage * times > 50) {
					break OUT;
				}
				System.out.printf("%d x %d = %d%n"
						, stage, times, stage * times);				
			}
			
		}

	}

}





