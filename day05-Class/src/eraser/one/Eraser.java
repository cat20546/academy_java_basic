package eraser.one;

/**
 * 칠판 지우개를 정의하는 클래스
 * -----------------------------------
 * 칠판 지우개의 속성을 정의하기 위하여
 * 가로 : width : double
 * 세로 : height: double
 * 높이 : depth : double
 * 겹   : layer : int
 * 네 개의 멤버 변수를 선언
 * ----------------------------------------
 * 기본 생성자 : 매개변수를 받지 않는 생성자
 * 매개변수를 받는 생성자 두 개를 정의
 * 매개변수를 받는 생성자는 네 개의 필드 모두에 대해서 
 * 매개변수를 받도록 정의한다.
 * ----------------------------------------
 * 칠판 지우개의 상태를 출력 : print() : void
 * 지우개의 한 겹을 제거 : peel() : void
 * ----------------------------------------
 * @author PC38206
 *
 */
public class Eraser {
	// 1. 멤버변수 선언부
	/** 지우개 가로 길이 */
	double width; 
	/** 지우개 세로 길이 */
	double height;
	/** 지우개 높이 길이 */
	double depth; 
	/** 지우개의 겹 수*/
	int    layer;
	
	// 2. 생성자 선언부
	/**
	 * 기본생성자
	 */
	public Eraser() {
		
	}

	/**
	 * 매개변수를 받아 모든 필드를 초기화하는 생성자
	 * @param newWidth
	 * @param newHeight
	 * @param newDepth
	 * @param newLayer
	 */
	public Eraser(double newWidth, double newHeight
			    , double newDepth, int newLayer) {
		width = newWidth;
		height = newHeight;
		depth = newDepth;
		layer = newLayer;
	}
	
	// 3. 메소드 선언부
	/**
	 * 지우개의 상태를 출력
	 */
	public void print() {
		System.out.printf("가로 : %4.2f, 세로 : %4.2f, "
				        + "높이 : %4.2f, 남은 겹 : %d%n"
				         , width, height, depth, layer);
	}
	
	/**
	 * 지우개를 한 겹 제거
	 */
	public void peel() {
		// 남아있는 겹의 수가 -값이 될 수는 없으므로
		// if 구문을 사용하여 값을 체크
		if ((layer - 1) >= 0) {
			layer -= 1;
		}
	}

}







