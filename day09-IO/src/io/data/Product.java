package io.data;

/**
 * 제품 판매 매장에서 관리하는 대상인
 * 제품을 정의하는 클래스
 * @author PC38206
 *
 */
public class Product {
	
	// 1. 멤버 변수 선언부
	/** 제품 코드 */
	private String prodCode;
	/** 제품 명 */
	private String prodName;
	/** 제품 가격 */
	private int price;
	/** 재고 수량 */
	private int quantity;
	
	// 2. 생성자 선언부
	/**
	 * 기본 생성자
	 */
	public Product() {
		
	}
	
	/**
	 * 제품 코드 필드만 초기화하는 생성자
	 * @param prodCode
	 */
	public Product(String prodCode) {
		this.prodCode = prodCode;
	}
	
	/**
	 * 모든 필드를 초기화하는 생성자
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode);
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	/** prodCode 의 접근자 */
	public String getProdCode() {
		return this.prodCode;
	}
	
	/** prodCode 의 수정자 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	
	/** prodName 의 접근자 */
	public String getProdName() {
		return prodName;
	}

	/** prodName 의 수정자 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/** price 의 접근자 */
	public int getPrice() {
		return price;
	}

	/** price 의 수정자 */
	public void setPrice(int price) {
		this.price = price;
	}

	/** quantity 의 접근자 */
	public int getQuantity() {
		return quantity;
	}

	/** quantity 의 수정자 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// 3. 메소드 선언부
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodCode == null) ? 0 : prodCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodCode == null) {
			if (other.prodCode != null)
				return false;
		} else if (!prodCode.equals(other.prodCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String strProduct = String.format(
				"제품 정보 [제품코드 : %s, 제품명 : %s"
		                 + ", 가격 %,d: , 재고수량 : %d]%n"
		         , prodCode, prodName, price, quantity);
		return strProduct;
	}

	
	
	
	
	
	
	
	

}
