package control.loop;

import java.util.Scanner;

/**
 * 점수를 입력받고 총점과 평균을 구하는 클래스
 * while 을 활용
 * @author PC38206
 *
 */
public class TotalNAverage {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int total = 0;
		int score = 0;
		int count = 0;
		
		double average;
		
		Scanner scan = new Scanner(System.in);
		
		// 3. 사용
		System.out.println("점수를 입력(끝내려면 0입력)");
		score = scan.nextInt();
		
		while (score != 0) {
			total += score;
			count++;
			
			System.out.println("점수를 입력(끝내려면 0입력)");
			score = scan.nextInt();
		}
		
		if (count == 0) {
			System.out.println("입력된 값이 없습니다.");
		} else {
			average = (double)total / count;
			System.out.printf("총점 : %d%n", total);
			System.out.printf("평균 : %5.2f%n", average);
		}

	}

}





