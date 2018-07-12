package api.object.test;

import api.object.Manager;
import api.object.Product;
import api.object.Shop;
import api.object.Warehouse;

/**
 * 매장에서 판매될 물건을 신규 추가/수정/삭제 등
 * 기능을 테스트하는 클래스
 * @author PC38206
 *
 */
public class ShopTest {

	public static void main(String[] args) {

		// 1. 창고에 들여놓을 제품 선반이 먼저 필요
		Product[] products = new Product[0];
		
		// 2. 선반을 설치할 창고를 지어야 함
		Warehouse warehouse = new Warehouse(products);
		
		// 3. 매장을 관리할 매니저를 고용함
		Manager manager = new Manager(warehouse);
		
		// 4. 매장을 오픈
		Shop abcMart = new Shop(manager);
		
		//--------------------------------------------------
		// 매장에 입고할 신규 제품(신발) 이 도착했다. 
		Product adidas = 
				new Product("S001", "슈퍼스타", 87200, 5);
		Product reebok = 
				new Product("S002", "리복 로얄 테크큐 티", 42000, 20);
		Product nike = 
				new Product("S003", "나이키 탄준 샌들", 41300, 30);
		Product crocs = 
				new Product("S004", "라이트라이드 샌들 우먼", 40200, 7);
		Product birkenstock = 
				new Product("S005", "지제 에바", 29000, 15);
		
		// 1. 매장에 도착한 제품을 입고
		abcMart.add(adidas);
		abcMart.add(reebok);
		abcMart.add(nike);
		abcMart.add(crocs);
		abcMart.add(birkenstock);
		
		// 2. 입고된 제품 전체 확인
		Product[] allProducts = abcMart.getAllProducts();
		for (Product product: allProducts) {
			product.print();
		}

		// 3. 아디다스 제품 수정
		Product adidas2 = 
				new Product("S001", "슈퍼스타", 75000, 5);
		abcMart.set(adidas2);
		
		// 4. 수정된 아디다스 제품 수정 확인
		System.out.println();
		abcMart.get(new Product("S001", null, 0, 0)).print();
		
		// 5. 판매 종료할 제품 폐기
		abcMart.remove(new Product("S001", null, 0, 0));
		
		// 6. 폐기 확인을 위해 전체 목록 재 조회
		System.out.println();
		for (Product product: abcMart.getAllProducts()) {
			product.print();
		}
		
	}

}





