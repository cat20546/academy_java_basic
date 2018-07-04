package operator.binary;

/**
 * 누적 대입 연산자중
 *  
 *  +=  연산자를 테스트
 * @author PC38206
 *
 */
public class PlusAssignment {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int num = 0;
		
		// 3. 사용
		System.out.println("초기 num 값 : " +  num); // 0
		
		num += 1; // num = num + 1;
		System.out.println("num += 1 수행 후 : " +  num); // 1

		num = num + 1;
		System.out.println("num = num + 1 수행 후 : " +  num); // 2
		
		num += num + 1;
		System.out.println("num += num + 1 수행 후 : " +  num); // 5
		
		num *= num * num;
		System.out.println("num *= num * num 수행 후 : " +  num); // 125
	}

}




