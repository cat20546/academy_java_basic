package array.multi;

/**
 * 동적 2차원 배열을 생성하고 사용해보는 클래스
 * 
 * 2차수의 배열은 각각 3, 4, 1, 5 사이즈로 생성
 * @author PC38206
 *
 */
public class Dynamic2D {

	public static void main(String[] args) {
		// 1. 선언
		int[][] twoDarray;
		int count = 0;
		
		// 2. 초기화
		twoDarray = new int[4][];
		
		twoDarray[0] = new int[3];
		twoDarray[1] = new int[4];
		twoDarray[2] = new int[1];
		twoDarray[3] = new int[5];
		
		// 3. 사용
		// (1) 2차원 배열의 각 칸에 1 ~ 13까지 
		//     for 구문을 사용하여 할당		
		for (int idx = 0; idx < twoDarray.length; idx++) {
			for (int idx2 = 0; idx2 < twoDarray[idx].length ; idx2++) {
				twoDarray[idx][idx2] = ++count;
			}
		}
		
		// (2) 할당한 값 확인을 위한 출력
		for (int idx = 0; idx < twoDarray.length; idx++) {
			for (int idx2 = 0; idx2 < twoDarray[idx].length ; idx2++) {
				System.out.printf("%d\t", twoDarray[idx][idx2]);
			}
			System.out.println();
		}
		System.out.println("==========================");
		
		// (3) foreach 로 출력
		for (int[] outer: twoDarray) {
			for (int in: outer) {
				System.out.printf("%d\t", in);
			}
			System.out.println();
		}
		
		
	}

}







