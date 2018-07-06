package array.cli;

/**
 * Eclipse IDE 에서 명령줄 인수를 사용하는 방법
 * 소스코드 ===> 오른쪽 마우스 버튼 클릭
 *          ===> Run as...
 *          ===> Run Configuration.. 
 *          ===> 명령줄 인수를 적용할 클래스를 왼쪽 목록에서 선택
 *          ===> (x)Arguments 탭에 데이터를 빈칸 구분 입력
 *          ===> apply  ===> run
 * 
 * @author PC38206
 *
 */
public class CmdLineArgs {

	public static void main(String[] args) {

		// main 메소드의 매개변수로 선언이 이미 되어 있는
		// args 변수를 출력
		for (String input: args) {
			System.out.printf("%s \t", input);
		}
		
	}

}
