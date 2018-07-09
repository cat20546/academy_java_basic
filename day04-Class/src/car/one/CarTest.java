package car.one;

/**
 * 자동차 라는 타입의 실제 객체를 생성하고
 * 테스트하는 클래스
 * @author PC38206
 *
 */
public class CarTest {

	public static void main(String[] args) {
		// Car 라는 타입의 객체를 사용하기 위한 변수가 필요함
		// 1. 선언 : 
		Car myCar;
		
		// 2. 초기화
		myCar = new Car();
		
		// 3. 사용 : Car 타입 안에 정의된 메소드를 호출
		System.out.println("1. 초기 myCar 의 속도");
		// 초기화 직후 출력
		myCar.print();
		System.out.println("=======================\n");
		
		
		System.out.println("2. 100만큼 가속 후 속도");
		// 100만큼 가속
		myCar.accelerate(100);
		myCar.print();
		System.out.println("=======================\n");
		
		System.out.println("3. 정지 후 속도");
		// 정지
		myCar.stop();
		myCar.print();
		
	}

}






