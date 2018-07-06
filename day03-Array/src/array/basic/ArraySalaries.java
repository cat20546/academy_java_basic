package array.basic;

/**
 * 직원들의 급여정보(기본형 int 타입)를
 * 저장하는 배열을 테스트하는 클래스이다.
 * 
 * @author PC38206
 *
 */
public class ArraySalaries {

	public static void main(String[] args) {
		// 1. 선언 : 배열참조 변수
		int[] salaries;
		
		// 2. 초기화 : 배열참조 변수는 기본형이 아닌 변수이므로
		//             초기화를 위해서 new 를 사용해야만 한다.
		salaries = new int[10];
		
		// 3. 사용 : 
		// 값을 넣기 전에 출력
//		int age;
//		System.out.println(age);
		
		System.out.printf("salaries[0]=%d%n", salaries[0]);
		System.out.printf("salaries[1]=%d%n", salaries[1]);
		System.out.printf("salaries[2]=%d%n", salaries[2]);
		System.out.printf("salaries[3]=%d%n", salaries[3]);
		System.out.printf("salaries[4]=%d%n", salaries[4]);
		System.out.printf("salaries[5]=%d%n", salaries[5]);
		System.out.printf("salaries[6]=%d%n", salaries[6]);
		System.out.printf("salaries[7]=%d%n", salaries[7]);
		System.out.printf("salaries[8]=%d%n", salaries[8]);
		System.out.printf("salaries[9]=%d%n", salaries[9]);
		
		// 각 배열의 칸에 값을 할당
		salaries[0] = 10;
		salaries[1] = 55;
		salaries[2] = 86;
		salaries[3] = 23;
		salaries[4] = 98;
		salaries[5] = 34;
		salaries[6] = 50;
		salaries[7] = 76;
		salaries[8] = 11;
		salaries[9] = 8;
		
		// 할당된 내용 출력
		System.out.println("=========== 할당 후 ============");
		System.out.printf("salaries[0]=%d%n", salaries[0]);
		System.out.printf("salaries[1]=%d%n", salaries[1]);
		System.out.printf("salaries[2]=%d%n", salaries[2]);
		System.out.printf("salaries[3]=%d%n", salaries[3]);
		System.out.printf("salaries[4]=%d%n", salaries[4]);
		System.out.printf("salaries[5]=%d%n", salaries[5]);
		System.out.printf("salaries[6]=%d%n", salaries[6]);
		System.out.printf("salaries[7]=%d%n", salaries[7]);
		System.out.printf("salaries[8]=%d%n", salaries[8]);
		System.out.printf("salaries[9]=%d%n", salaries[9]);
		
		// ================================================
		// for 반복 구조와 배열의 조합 1
		System.out.printf("salaries 의 길이:%d%n"
				          , salaries.length);
		
		for (int idx = 0; idx < salaries.length; idx++) {
			System.out.printf("salaries[%d]=%d%n"
					          , idx, salaries[idx]);			
		}
		
		
		
		
		
	}

}










