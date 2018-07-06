package array.init;

/**
 * 배열을 초기화 할 때, 
 * 각 배열 원소의 초기화 값을 알아보는 클래스
 * 
 * int 타입을 저장하는 배열을 하나 선언하고
 * 초기화 후 각 배열 원소의 초기값을 확인해보자
 * @author PC38206
 *
 */
public class IntArrayInit {

	public static void main(String[] args) {
		// 1. 선언
		int[] numbers;
		
		// 2. 초기화
		numbers = new int[10];
		
		// 3. 사용 : 초기화 직후 각 원소의 값 확인
		for (int number: numbers) {
			System.out.printf("number=%d%n", number);
		}

	}

}





