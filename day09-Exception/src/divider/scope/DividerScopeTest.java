package divider.scope;

public class DividerScopeTest {

	public static void main(String[] args) {
		// 1. 선언
		DividerScope divScope;
		
		// 2. 초기화
		divScope = new DividerScope();
		
		// 3. 사용
		System.out.println("==== main 이 실행 되었습니다. ====");
		
		divScope.level1();
		
		System.out.println("==== main 이 종료 되었습니다. ====");

	}

}
