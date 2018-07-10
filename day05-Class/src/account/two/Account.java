package account.two;

/**
 * 은행 계좌를 정의하는 클래스
 * -----------------------------------------------------
 * 계좌의 속성을 나타내기 위하여 두 개의 멤버변수를 선언
 * 계좌 번호 : accNumber
 * 계좌 잔액 : balance
 * -----------------------------------------------------
 * 기본생성자 : 매개변수가 비어있는 생성자
 * 매개변수를 받는 생성자를 중복 정의
 * -----------------------------------------------------
 * 계좌의 잔액을 증가시키는 입금 메소드 : deposit(amount)
 * 계좌의 현재 상태를 출력하는 메소드 : print() 
 * @author PC38206
 *
 */
public class Account {
	// 1. 멤버변수(실체변수) 선언부
	/** 계좌 번호 */
	int accNumber;
	/** 계좌 잔액 */
	int balance;
	
	// 2. 생성자 선언부 (생략)
	/**
	 * 기본생성자 : 클래스 이름과 동일하고(대소문자까지 일치)
	 * 매개변수 목록이 비어있는 생성자
	 */
	Account() { 
		
	}
	
	/**
	 * 계좌 번호, 계좌 잔액을 매개변수로 받아서
	 * 입력된 값으로 계좌를 초기화하는 생성자
	 *  
	 * @param newAccNumber : 새로 생성할 계좌의 번호
	 * @param newBalance   : 새로 생성할 계좌의 잔액
	 */
	Account(int newAccNumber, int newBalance) {
		accNumber = newAccNumber;
		balance = newBalance;
	}
	
	
	// 3. 메소드 선언부
	/**
	 * 입력된 amount 만큼 이 계좌의 잔액을 증가시킨다.
	 * @param amount : 입금할 금액
	 */
	public void deposit(int amount) {
		balance += amount;
	}
	
	/**
	 * 이 계좌의 상태를 출력
	 */
	public void print()	 {
		System.out.printf("계좌 번호 : %d | \t계좌 잔액 : %d%n"
				         , accNumber, balance);
	}

}














