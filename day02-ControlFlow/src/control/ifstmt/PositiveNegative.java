package control.ifstmt;

import java.util.Scanner;

/**
 * 하나의 정수를 입력받아서
 * 음수인지, 0인지, 양수인지를 
 * 판단하는 클래스이다.
 * --------------------------------------
 * 값의 부호를 판단할 때
 * if ~ else if ~ else 구문을 사용
 * --------------------------------------
 * @author PC38206
 *
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// 1. 선언
		// 입력받을 변수 선언
		int input;
		// 양수, 0, 음수 결과 판단을 저장할 변수
		String result;
		
		// 스캐너 변수 선언
		Scanner scan;
		
		// 2. 초기화
		// 스캐너 변수 초기화
		scan = new Scanner(System.in);
		
		// 스캐너를 사용하여 입력 변수 초기화(입력)
		System.out.println("정수 하나를 입력");
		input = scan.nextInt();
		
		// 3. 사용
		// 입력 값이 저장된 input 변수를 
		// if ~ else if ~ else 구문으로 부호 판단
//		if (input > 0) {
//			result = "양수";
//		} else if (input == 0) {
//			result = "0";
//		} else {
//			result = "음수";
//		}
		
		if (input > 0) {
			result = "양수";
		} else if (input < 0) {
			result = "음수";
		} else {
			result = "0";
		}
		
		// 출력
		System.out.printf("입력 값 %d 는 %s 입니다.%n", input, result);
	}

}











