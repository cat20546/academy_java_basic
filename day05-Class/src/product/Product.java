package product;

/**
 * 제품 판매 매장에서 관리하는 대상인
 * 제품을 정의하는 클래스
 * -------------------------------------------
 * 제품번호 : prodCode : String
 * 제품 명  : prodName : String
 * 가격     : price    : int
 * 재고수량 : quantity : int
 * -------------------------------------------
 * 기본생성자, 매개변수를 받는 생성자 각 필드 1개씩 늘려가며
 * 생성자 중복정의로 5개의 생성자를 정의 this, this() 사용
 * -------------------------------------------
 * 메소드 
 * print() : void 
 *    ==> 제품의 상태 출력
 * discount(double percentage) : int 
 *    ==>입력된 퍼센트만큼 할인가격 리턴
 * sell(int amount) : void 
 *    ==> 매장에서 판매(출고)되어 재고수량이 줄어듬
 * buy(int amount) : void
 *    ==> 매장에 입고되어 재고수량이 늘어남
 * 
 *  
 * @author PC38206
 *
 */
public class Product {
	
	// 1. 멤버 변수 선언부
	/** 제품 코드 */
	String prodCode;
	String prodName;
	int price;
	int quantity;
	
	// 2. 생성자 선언부
	Product() {
		
	}
	
	Product(String prodCode) {
		this.prodCode = prodCode;
	}
	
	Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode);
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 3. 메소드 선언부
	
	public void print() {
		System.out.printf("제품 정보 [제품코드 : %s, 제품명 : %s"
				         + ", 가격 %d: , 재고수량 : %d]%n"
				         , prodCode, prodName, price, quantity);
	}
	
	public int discount(double percentage) {
		// percentage > 0
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * (percentage / 100));
		}
		
		return price;
	}
	
	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을때만
		// 출고함.
		if (this.quantity >= amount) {
			this.quantity -= amount;
		}
	}
	
	public void buy(int amount) {
		// 입고된 만큼 재고수량 증가 후 저장반영
		this.quantity += amount;		
	}
	
	
	
	
	
	
	
	
	

}
