package control.swtchstmt;

import java.util.Scanner;

/**
 * switch 구문으로 아래의 문제를 해결
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
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("0 ~ 100 사이의 점수를 입력 ");
		score = scan.nextInt();
		
		// 3. 사용
		switch (score / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 6: case 7:
			grade = 'C';
			break;
		case 5: case 4:
			grade = 'D';
			break;
		
			default :
				grade = 'F';
		} // end switch
		
		// 출력
		System.out.printf("점수 : %d, 학점 : %c%n", score, grade);
	}

}










