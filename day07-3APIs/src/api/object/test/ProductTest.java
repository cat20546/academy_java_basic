package api.object.test;

import api.object.Product;

/**
 * 매장에서 제품을 생성하고 입출고, 
 * 할인가격을 구하는 등의
 * 기능을 테스트하는 클래스
 * @author PC38206
 *
 */
public class ProductTest {

	public static void main(String[] args) {
		
		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
		Product product;
		
		// 2. 초기화
		product = new Product("P001", "MS-아크 터치 마우스"
				             , 51330, 36);
		
		// 3. 사용
		// (1) 제품 상태 출력
		product.print();
		
		// (2) 20% 할인가는 어떻게 되나?
		int cdPrice = product.discount(20);
		System.out.printf("제품 가격 : %,d,  20%% 할인가 : %,d%n"
				         , product.getPrice(), cdPrice);
		
		// (3) 2개 판매(sell)
		product.sell(2);
		
		// (4) 상태 출력
		product.print();
		
		// (5) 10개 입고(buy)
		product.buy(10);
		
		// (6) 상태 출력
		product.print();
		
		System.out.println("==============================");
		System.out.println(product);
		System.out.println("==============================");		

	}

}










