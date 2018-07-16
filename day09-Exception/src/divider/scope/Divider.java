package divider.scope;

/**
 * int 형 입력 값 하나를 받아서
 * 지정된 수식을 계산하는 메소드를 가진 클래스
 * 
 * 이 메소드는 입력 값이 1, 0 인 경우는 0으로 나누는
 * 상황이 발생하는 수식을 처리한다.
 * 입력 값에 따라 0으로 나누는 상황이 발생할 수도 있고
 * 발생하지 않을 수도 있다.
 * 
 * 0으로 나누는 상황이 발생하는 경우 
 * DivideZeroException을 사용하여
 * 사전에 처리하도록 하자.
 * 
 * 
 * @author PC38206
 *
 */
public class Divider {

	// 2. 생성자 선언부
	// 기본생성자 명시
	public Divider() { }
	
	// 3. 메소드 선언부
	public int divide(int x) throws DivideZeroException {
		switch (x) {
		case 0: case 1:
			throw new DivideZeroException();
			
		default:
			break;
		}
		
		int result = (int)(100 / (x * (x - 1)));
		return result;
		
	}
}



















