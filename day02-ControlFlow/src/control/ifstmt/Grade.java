package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문을 사용하여 다음의 기준으로
 * 
 * 90점 이상 A
 * 80 ~ 89 B
 * 60 ~ 79 C
 * 40 ~ 59 D
 * 나머지 F
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스를 작성
 * 
 * 점수 int 타입 변수명 score
 * 학점 char 타입 변수명 grade 을 사용할 것
 * 
 * 출력시 printf 사용
 * @author PC38206
 *
 */
public class Grade {

	public static void main(String[] args) {
		// 1. 선언
		// 점수를 입력받을 변수, 학점을 저장할 변수 선언
		int score;
		char grade;
		// 스캐너 변수 선언
		Scanner scan;
		
		
		// 2. 초기화
		// 스캐너 변수 초기화
		scan = new Scanner(System.in);
		
		// 스캐너를 사용하여 score 변수 초기화
		System.out.println("0 ~ 100점 사이의 점수를 입력");
		score = scan.nextInt();
		
		// 3. 사용 : score 에 입력된 값을 판단
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {// && score < 90) {
			grade = 'B';
		} else if (score >= 60) {// && score < 80) {
			grade = 'C';			
		} else if (score >= 40) {// && score < 60) {
			grade = 'D';			
		} else {
			grade = 'F';	
		}
		
		// 출력
		System.out.printf("%d 점에 해당하는 학점은 %c%n"
				         , score, grade);

	}

}








