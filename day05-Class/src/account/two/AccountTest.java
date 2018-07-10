package account.two;

/**
 * 계좌(Account) 클래스의 
 * 인스턴스(객체, 실체)를 생성하고
 * 입금기능, 현재 계좌 상태등을 출력해보며
 * 테스트하는 클래스
 * @author PC38206
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1. 선언 : 계좌의 객체 참조 변수
		Account myAccount;
		Account yourAccount;
		
		// 2. 초기화
		// 기본 생성자로 초기화
		myAccount = new Account();
		// 매개변수를 받는 생성자로 초기화
		yourAccount = new Account(1, 10000);
		
		// 3. 사용
		// (0) 초기 상태 출력
		myAccount.print();
		yourAccount.print();
		
		// (1) 입금 1000원
		myAccount.deposit(1000);
		yourAccount.deposit(1000);
		
		// (2) 상태 출력
		myAccount.print();
		yourAccount.print();
		
		// (3) 입금 5000원
		myAccount.deposit(5000);
		yourAccount.deposit(5000);
		
		// (4) 상태 출력
		myAccount.print();
		yourAccount.print();
		
		

	}

}





