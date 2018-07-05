package control.loop;

/**
 * for 반복구조를 사용하여 1 ~ 10 까지
 * 제곱표를 출력하는 클래스
 * 
 * @author PC38206
 *
 */
public class SquareTable {

	public static void main(String[] args) {
		for (int idx = 1; idx <= 10; idx++) {
			System.out.printf("%4d x %4d = %4d%n", idx, idx, idx * idx);
		} 

	}

}
